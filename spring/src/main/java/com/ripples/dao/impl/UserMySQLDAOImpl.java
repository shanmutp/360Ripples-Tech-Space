package com.ripples.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.ripples.dao.interfaces.IUserDAO;
import com.ripples.domain.User;
import com.ripples.domain.mapper.UserMapper;
import com.ripples.spring.bean.UserBean;

public class UserMySQLDAOImpl implements IUserDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		this.namedTemplate = new NamedParameterJdbcTemplate(dataSource);
		this.simpleJDBCTemplate = new SimpleJdbcTemplate(dataSource);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	private JdbcTemplate jdbcTemplateObject;
	private NamedParameterJdbcTemplate namedTemplate;
	private SimpleJdbcTemplate simpleJDBCTemplate;

	// used for returning a single value int long or string as object
	public String getUserDetails(UserBean b) {
		// TODO Auto-generated method stub
		System.out.println("MYSQL data fecthed");
		String SQL = "select password from user where user_name = ?";
		String password = jdbcTemplateObject.queryForObject(SQL, new Object[] { b.getUserName() }, String.class);
		System.out.println("password:" + password);
		return password;
	}

	// returns user object using rowmapper interface
	public User getUserDetails(String userName) {

		String SQL = "select * from user where user_name = ?";
		User user = jdbcTemplateObject.queryForObject(SQL, new Object[] { userName }, new UserMapper());
		return user;
	}

	// returns list of user objects using rowmapper interface
	public List<User> getUserDetails() {

		String SQL = "select * from user";
		List<User> userList = jdbcTemplateObject.query(SQL, new UserMapper());
		return userList;
	}

//JDBCTemplate
	public void addUser(UserBean bean) {
		String SQL = "insert into user values(?,?)";
		int result = jdbcTemplateObject.update(SQL, new Object[] { bean.getUserName(), bean.getPassword() });
	}
//Named parameter template
	public void addUserNamedParameter(UserBean bean) {
		String SQL = "insert into user values(:name,:password)";
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("name", bean.getUserName());
		paramMap.put("password", bean.getPassword());
		namedTemplate.execute(SQL, paramMap, new PreparedStatementCallback<Integer>() {

			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return ps.executeUpdate();
			}
		});

	}
	//simple JDBC template
		public void addUserSimpleJDBCTempate(UserBean bean) {
			String SQL = "insert into user values(?,?)";
			int result = simpleJDBCTemplate.update(SQL, bean.getUserName(),bean.getPassword());			
		}

	
}
