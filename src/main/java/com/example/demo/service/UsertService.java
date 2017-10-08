package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.Repository;

@Service
public class UsertService implements UserServiceInterface {

	@Autowired
	Repository repository;
	@Override
	public Iterable<Users> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Users find(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public void save(Users user) {
		// TODO Auto-generated method stub
		repository.save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.delete(id);
	}

	
}
