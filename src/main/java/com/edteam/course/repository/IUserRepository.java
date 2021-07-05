package com.edteam.course.repository;

import com.edteam.course.models.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User,Integer>{
    User findUserById(Integer id);
}
