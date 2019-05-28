package com.example.demo.transactional.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author tuxiaolei
 * @create 2019/5/28
 */
@Mapper
public interface PersonMapper {
    /**
     * 新增
     * @param id
     * @param name
     */
    void insert(@Param("id")Integer id, @Param("name")String name);

    /**
     *  删除
     * @param id
     */
    void delete(@Param("id") Integer id);
}
