package com.example.repository;

import com.example.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ming on 2016/8/24.
 */
@Transactional
public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByPhone(String username);
}
