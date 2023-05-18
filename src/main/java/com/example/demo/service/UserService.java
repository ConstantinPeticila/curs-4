package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User addUser(User user) {
        //validari
        if(user.getVarsta() < 18){
            return null;
        }
        //call repository
        return repository.addUserInDB(user);
    }

    public User getUser(Integer id) {
        return repository.getUserFromDB(id);
    }

    public List<User> getAllUsers() {
        return repository.getAllUsersFromDB();
    }

    public List<User> deleteAllUsersByName(String name) {
        return repository.deleteAllUsersByNameFromDB(name);
    }
}
