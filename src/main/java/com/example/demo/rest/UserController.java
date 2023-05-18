package com.example.demo.rest;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User response = service.addUser(user);
        if(response == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(response);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        User response = service.getUser(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(service.getAllUsers());
    }

    @DeleteMapping("/byName")
    public ResponseEntity<List<User>> deleteUsersByName(@RequestParam String name){
        return ResponseEntity.ok(service.deleteAllUsersByName(name));
    }
}
