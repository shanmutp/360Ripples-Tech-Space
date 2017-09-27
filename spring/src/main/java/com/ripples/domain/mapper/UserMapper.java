package com.ripples.domain.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ripples.domain.User;

public class UserMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User();
		user.setUserName(rs.getString("user_name"));
		user.setPassword(rs.getString("password"));
		return user;
	}

}
