package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Users;

public interface Repository extends CrudRepository<Users,Integer> {

}
