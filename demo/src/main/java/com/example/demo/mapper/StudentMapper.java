package com.example.demo.mapper;/**
 * @author JasonZeng
 * @E-mail: 1103022627@qq.com
 * @DESCRIPTION:
 * @since 2019/5/16 12:27
 */

import com.example.demo.Person;
import com.example.demo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author tuxiaolei
 * @create 2019/5/16
 */
@Mapper
public interface StudentMapper {

    void insert(@Param("id")Integer id, @Param("name")String name);
}
