package com.excellence.springboot.dao;

import java.util.List;

import com.excellence.springboot.model.UserStatTotal;

public interface BaseDao {
	public List<UserStatTotal> queryAll(int start, int limit);
	long countAll();
}	
