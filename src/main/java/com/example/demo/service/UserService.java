package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRealRepository;
import com.example.demo.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

//    private final UserRepository repository;
    private final UserRealRepository repository;


    public User addUser(User user) {
        //validari
        /*if(user.getVarsta() < 18){
            return null;
        }*/
        //call repository
        return repository.save(user);
    }

    public User getUser(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Transactional
    public List<User> deleteAllUsersByName(String name) {
        return repository.deleteByFirstname(name);
    }
}
