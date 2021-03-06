package com.sydth.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sydth.model.AppUser;

@Repository
public interface UserDAO extends CrudRepository<AppUser, Integer> {

	AppUser findByUsername(String username);
}