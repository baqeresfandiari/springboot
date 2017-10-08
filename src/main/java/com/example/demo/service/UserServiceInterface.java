package com.example.demo.service;

import com.example.demo.model.Users;

public interface UserServiceInterface {
	
	public Iterable<Users> findAll();
	public Users find(int id);
	public void save(Users user);
	public void delete(int id);

}
