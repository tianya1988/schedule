package com.cnpc.schedule.dao;

import com.cnpc.schedule.entity.Node;

import java.util.List;

/**
 * Created by jason on 18-5-2.
 */
public interface NodeDao {
    public int add(Node node);

    public List<Node> getAll();
}
