package com.ku.batis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseMapper<T> {

    List<T> listSearch(T search);

    void save(T entity);

    void batchSave(List<T> coll);

    void  delete(Long id);
    
    void batchDelete(List<T> coll);

    void update(T entity);

    void batchUpdate(List<T> coll);

}
