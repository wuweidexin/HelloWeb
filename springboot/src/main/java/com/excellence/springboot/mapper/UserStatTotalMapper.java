package com.excellence.springboot.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.excellence.springboot.model.UserStatTotal;

/**
 * @author chen
 */
@SuppressWarnings("rawtypes")
public class UserStatTotalMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		if(null != rs) {
			UserStatTotal ns = new UserStatTotal();
			ns.setActiveUser(rs.getInt("activeUser"));
			ns.setLongName(rs.getString("longName"));
			ns.getUserStatTotalFK().setLongNumber(rs.getString("longNumber"));
			ns.setParentId(rs.getString("parentId"));
			ns.setTotalUser(rs.getInt("totalUser"));
			ns.getUserStatTotalFK().setWbNetworkId(rs.getString("wbnetworkId"));
			return ns;
		}
		return null;
	}

}
