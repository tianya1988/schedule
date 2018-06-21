package com.cnpc.schedule.service;

import com.cnpc.schedule.bean.NodeBean;
import com.cnpc.schedule.entity.Node;

import java.util.List;

/**
 * Created by jason on 18-5-2.
 */
public interface NodeService {
    public int add(NodeBean nodeBean);

    List<Node> getAll();
}
