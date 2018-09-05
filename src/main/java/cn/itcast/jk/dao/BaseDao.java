package cn.itcast.jk.dao;

import cn.itcast.jk.pagination.Page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Description: 泛型类，基础的DAO接口
 */
public interface BaseDao<T> {
    List<T> findPage(Page page);                //分页查询

    List<T> find(Map paraMap);                //带条件查询，条件可以为null，既没有条件；返回list对象集合

    T get(Serializable id);                    //只查询一个，常用于修改

    void insert(T entity);                    //插入，用实体作为参数

    void update(T entity);                    //修改，用实体作为参数

    void deleteById(Serializable id);        //按id删除，删除一条；支持整数型和字符串类型ID

    void delete(Serializable[] ids);            //批量删除；支持整数型和字符串类型ID
}
