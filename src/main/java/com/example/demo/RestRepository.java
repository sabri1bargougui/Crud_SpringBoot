package com.example.demo;

import com.example.demo.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface RestRepository extends CrudRepository<User, Long> {

}
