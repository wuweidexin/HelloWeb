package com.excellence.springboot.dao.impl;
/**
 * 使用JdbcTemplate操作的范例
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.excellence.springboot.dao.BaseDao;
import com.excellence.springboot.mapper.UserStatTotalMapper;
import com.excellence.springboot.model.UserStatTotal;
@Repository
public class BaseDaoImpl implements BaseDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<UserStatTotal> queryAll(int start, int limit) {
		 /*jdbcTemplate.query(
	                "SELECT id, first_name, last_name FROM customers WHERE first_name = ?", new Object[] { "Josh" },
	                (rs, rowNum) -> new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
	        ).forEach(customer -> log.info(customer.toString()));*/
		
		String sql = "select * from t_user_stat_total limit ?,?";
		List<UserStatTotal> list = jdbcTemplate.query(sql, new Object[]{start, limit}, new UserStatTotalMapper());
		return list;
	}

	public long countAll() {
		String sql = "select count(*) from t_user_stat_total";
		long count = jdbcTemplate.queryForObject(sql, Long.class);
		return count;
	}

}
