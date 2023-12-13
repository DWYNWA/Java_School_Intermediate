package com.example.javasamplepj.domain.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.javasamplepj.domain.mapper.UserMapper;
import com.example.javasamplepj.domain.model.user.User;

@Repository
// @RequiredArgsConstructor
public class UserRepository {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    /**
     * ユーザー情報 Repository
     */
    public User findById(Long userId) {
        return userMapper.findById(userId);
    }

    public int create(User user) {
        return userMapper.insert(user);
    }

}