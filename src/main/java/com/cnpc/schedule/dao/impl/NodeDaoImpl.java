package com.cnpc.schedule.dao.impl;

import com.cnpc.schedule.dao.NodeDao;
import com.cnpc.schedule.entity.Node;
import com.cnpc.schedule.mapper.NodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jason on 18-5-2.
 */
@Repository
public class NodeDaoImpl implements NodeDao {

    @Autowired
    private NodeMapper nodeMapper;

    @Override
    public int add(Node node) {
        return nodeMapper.insert(node);
    }

    @Override
    public List<Node> getAll() {
        return nodeMapper.selectAll();
    }
}
