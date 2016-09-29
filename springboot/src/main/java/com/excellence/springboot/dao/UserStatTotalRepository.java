package com.excellence.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.springboot.model.UserStatTotal;
import com.excellence.springboot.model.UserStatTotalFK;
/**
 * 集成
 * @author chen
 *
 */
public interface UserStatTotalRepository extends JpaRepository<UserStatTotal, UserStatTotalFK>{

}
