package com.exam.Repositories;

import com.exam.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
  public User findByUsername(String username);


}
