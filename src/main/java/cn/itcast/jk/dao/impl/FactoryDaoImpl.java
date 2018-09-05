package cn.itcast.jk.dao.impl;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao {
    public FactoryDaoImpl() {
        //设置命名空间
        super.setNs("cn.itcast.jk.mapper.FactoryMapper");
    }

    public void updateState(Map map) {
        super.getSqlSession().update(super.getNs() + ".updateState", map);
    }
}
