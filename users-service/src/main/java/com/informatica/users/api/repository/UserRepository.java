package com.informatica.users.api.repository;


import com.informatica.users.api.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {}