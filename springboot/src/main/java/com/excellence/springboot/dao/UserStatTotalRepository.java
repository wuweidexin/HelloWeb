package com.excellence.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.excellence.springboot.model.UserStatTotal;
import com.excellence.springboot.model.UserStatTotalFK;

public interface UserStatTotalRepository extends CrudRepository<UserStatTotal, UserStatTotalFK>{

}
