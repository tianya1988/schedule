package com.cnpc.schedule.service.impl;

import com.cnpc.schedule.bean.NodeBean;
import com.cnpc.schedule.dao.NodeDao;
import com.cnpc.schedule.entity.Node;
import com.cnpc.schedule.service.NodeService;
import com.cnpc.schedule.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by jason on 18-5-2.
 */

@Service
public class NodeServiceImpl implements NodeService {
    @Autowired
    private NodeDao nodeDao;

    @Override
    public int add(NodeBean nodeBean) {
        Node node = new Node();
        node.setNodeId(StringUtil.generateUuid());
        node.setNodeName(nodeBean.getNodeName());
        node.setNodeType(nodeBean.getNodeType());
        node.setCreateTime(new Date());
        node.setUpdateTime(new Date());

        return nodeDao.add(node);
    }

    @Override
    public List<Node> getAll() {
        return nodeDao.getAll();
    }
}
