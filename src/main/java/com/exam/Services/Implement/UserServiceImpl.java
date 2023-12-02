package com.exam.Services.Implement;

import com.exam.Entities.Role;
import com.exam.Entities.User;
import com.exam.Entities.UserRole;
import com.exam.Repositories.RoleRepository;
import com.exam.Repositories.UserRepository;
import com.exam.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    //creating user
    @Override
    public User createUser(User user,Set<UserRole> userRoles) throws Exception {
//        User saveData= new User();
//      saveData.setUsername(user.getUsername());
//      saveData.setPassword(user.getPassword());
//      saveData.setFirstName(user.getFirstName());
//       saveData.setLastname(user.getLastname());
//        saveData.setEmail(user.getEmail());
//        saveData.setPhone(user.getPhone());

            User local=this.userRepository.findByUsername(user.getUsername());
            if(local!=null)
            {
                System.out.println("User is already there !!");
                throw new Exception("User already present");
            }
            else{
                // user create
                for(UserRole ur:userRoles)
                {
                    roleRepository.save(ur.getRole());
                }
                user.getUserRoles().addAll(userRoles);
                local=this.userRepository.save(user);

            }
//
            return local;
    }
//    public Role createRole(Role role){
//        Role setRoles= new Role();
//        setRoles.setRoleId(role.getRoleId());
//        setRoles.setRoleName(role.getRoleName());
//        return this.roleRepository.save(setRoles);
    //}
    //            Role role1 = new Role();
//            role1.setRoleId(role.getRoleId());
//            role1.setRoleName(role.getRoleName());
//            Set<UserRole> roles=new HashSet<>();
//            UserRole userRole=new UserRole();
//            userRole.setRole(role);
//            userRole.setUser(user);
//            roles.add(userRole);

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }


}
