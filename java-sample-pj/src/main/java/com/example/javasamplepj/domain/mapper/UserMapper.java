package com.example.javasamplepj.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.javasamplepj.domain.model.user.User;

@Mapper
public interface UserMapper {
    int insert(User user);

    List<User> findAll();

    User findById(Long id);
}