package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

    private final List<User> userTable = new ArrayList<>();

    private Integer index = 0;
    public User addUserInDB(User user) {
        user.setId(index);
        index++;
        userTable.add(user);
        return user;
    }

    public User getUserFromDB(Integer id) {
/*        User utilizator = null;
        for(User user: userTable){
            if(user.getId().equals(id)){
                utilizator =  user;
            }
        }
        if(utilizator == null){
            throw  new RuntimeException("Nu exista user");
        }
        return utilizator;*/

        return userTable.stream()
                .filter(user -> user.getId().equals(id))
                .findAny()
                .orElseThrow();
    }

    public List<User> getAllUsersFromDB() {
        return userTable;
    }

    public List<User> deleteAllUsersByNameFromDB(String name) {

        List<User> userToDelete = userTable.stream()
                .filter(user -> user.getNume().equals(name))
                .collect(Collectors.toList());

        userTable.removeAll(userToDelete);
        return userToDelete;
    }
}
