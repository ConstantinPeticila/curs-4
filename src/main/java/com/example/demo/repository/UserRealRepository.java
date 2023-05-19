package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRealRepository extends JpaRepository<User,Integer> {
//    @Query("DELETE FROM user u where u.firstname =?")
    List<User> deleteByFirstname(String firstName);
}
