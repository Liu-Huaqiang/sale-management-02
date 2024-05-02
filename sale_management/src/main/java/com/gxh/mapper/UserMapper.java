package com.gxh.mapper;

import com.gxh.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    @Select("select id, username, selfIntro from user where username = #{username} and password = #{password}")
    User findUserByUsernameAndPassword(User user);

    @Select("select count(*) from user where username = #{username}")
    Integer findUserByUsername(User user);

     @Insert("insert into user (username, password) values (#{username}, #{password})")
    void insertUser(User user);

     @Update("update user set selfIntro = #{selfIntro} where username = #{username}")
    void updateUserByUsername(User user);
}
