package com.neu.dao;

import org.apache.ibatis.annotations.*;
import com.neu.model.User;

import java.util.List;

@Mapper
public interface UserDao {
    @Insert("insert into user values(#{id}, " +
            "#{name}, #{password}, #{phoneNum})")
    int insert(User user);

    @Delete("delete from user where id=#{id}")
    int deleteById(long id);

    @Update("update user set name=#{name}, password=#{password}, phoneNum=#{phoneNum}" +
            " where id=#{id}")
    int updateById(User user);

    @Select("select * from user where id=#{id};")
    User selectById(long id);

    @Select("select * from user;")
    List<User> selectAllUsers();

}
