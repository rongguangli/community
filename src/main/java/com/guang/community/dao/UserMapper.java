package com.guang.community.dao;


import com.guang.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectUserById(int id);

    User selectUserByName(String name);

    User selectUserByEmail(String email);

    int insertUser(User user);

    int updateUserStatus(int id, int status);

    int updateUserHeader(int id, String headerUrl);

    int updateUserPassword(int id, String password);

}
