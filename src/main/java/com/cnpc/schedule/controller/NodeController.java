package com.cnpc.schedule.controller;

import com.cnpc.schedule.bean.NodeBean;
import com.cnpc.schedule.builder.ResultBuilder;
import com.cnpc.schedule.service.NodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by developer on 4/13/18.
 */
@RestController
public class NodeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NodeService nodeService;

    @RequestMapping(value = "/node", method = RequestMethod.POST)
    public Map add(@RequestBody NodeBean nodeBean) {
        return ResultBuilder.buildSuccess(nodeService.add(nodeBean));
    }

    @RequestMapping(value = "/nodes", method = RequestMethod.GET)
    public Map getAll() {
        return ResultBuilder.buildSuccess(nodeService.getAll());
    }
}
