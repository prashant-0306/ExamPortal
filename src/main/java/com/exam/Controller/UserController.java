package com.exam.Controller;

import com.exam.Entities.Role;
import com.exam.Entities.User;
import com.exam.Entities.UserRole;
import com.exam.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;


    //creating user
        @PostMapping("/")
        public User createUser(@RequestBody User user) throws Exception {
            Set<UserRole> roles = new HashSet<>();
            Role role = new Role();
           role.setRoleId(12L);
            role.setRoleName("Normal");
            UserRole userRole = new UserRole();
            userRole.setUser(user);
            userRole.setRole(role);
            roles.add(userRole);
            return this.userService.createUser(user,roles);
    }
    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") String username)
    {
        return this.userService.getUser(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long id)
    {
        this.userService.deleteUser(id);
    }



}
