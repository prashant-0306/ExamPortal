package com.exam;

import com.exam.Entities.Role;
import com.exam.Entities.User;
import com.exam.Entities.UserRole;
import com.exam.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		try {
//        System.out.println("starting");
//
//           User user = new User();
//
//            user.setFirstName("Prashant");
//            user.setLastname("Kumar");
//            user.setUsername("prash123");
//            user.setEmail("pras@gmail.com");
//			user.setPassword("abc");
//			user.setPhone("123456");
//
//            Role role1 = new Role();
//            role1.setRoleId(10L);
//            role1.setRoleName("admin");
//
//            Set<UserRole> userRoleSet = new HashSet<>();
//            UserRole userRole = new UserRole();
//
//            userRole.setRole(role1);
//
//            userRole.setUser(user);
//
//            userRoleSet.add(userRole);
//
//            User user1 = this.userService.createUser(user, userRoleSet);
//            System.out.println(user1.getUsername());
//
//        }
//		catch (Exception e) {
//            e.printStackTrace();
//             }

	}
}

