package com.springjpa.course.resources;

import com.springjpa.course.entities.User;
import com.springjpa.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        List users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id){
        User user = userService.findById(id);
        if(user != null){
            return ResponseEntity.ok().body(user);
        }
        return null;
    }

}
