package cn.itcast.jk.dao;

import java.util.Map;

import cn.itcast.jk.domain.Factory;

public interface FactoryDao extends BaseDao<Factory> {
    void updateState(Map map);            //修改状态
}
