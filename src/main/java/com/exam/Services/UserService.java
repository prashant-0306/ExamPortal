package com.exam.Services;

import com.exam.Entities.Role;
import com.exam.Entities.User;
import com.exam.Entities.UserRole;

import java.util.List;
import java.util.Set;

public interface   UserService {

    //creating user

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    public User getUser(String username);

    public List<User> getAllUser();

    public User updateUser(User user,Long id);

    public void deleteUser(Long id);

}
