package com.bailian.mp.supplier.paas.datasource;

import java.util.List;

/**
 * @author:gaoxu
 * @create:2020-03-18 15:26
 **/
public interface GenericMapper<T> {
    int deleteByPrimaryKey(Long id);

    long insert(T record);

    long insertSelective(T record);

    T selectByPrimaryKey(Long id);

    List<T> selectAll();

    int updateByPrimaryKey(T record);

    int updateByPrimaryKeySelective(T record);
}
