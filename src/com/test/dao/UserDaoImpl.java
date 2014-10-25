package com.test.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.test.jdbc.UserRowMapper;
import com.test.model.User;

public class UserDaoImpl implements UserDao {
    @Autowired
    DataSource dataSource;
//	@Override
//	public void insertData(User user) {
//		
//         String sql = "INSERT INTO user"
//        		 +"username, password,email,birthdate,profession"
//        		 +"VALUES(?,?,?,?)";
//         JdbcTemplate jTem = new JdbcTemplate(dataSource);
//         jTem.update( sql,
//        		 new Object[]{user.getUsername(),user.getPassword()
//        				     ,user.getEmail(),user.getBirthDate()
//        				     ,user.getProfession()});
//	}

	@Override
	public List<User> getUserList() {
		List userList = new ArrayList(); 
		String sql = "SELECT * FROM user";
		JdbcTemplate jTem = new JdbcTemplate(dataSource);
		userList = jTem.query(sql, new UserRowMapper());
		return userList;
	}

	@Override
	public void updateData(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteData(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertData(User user) {
		// TODO Auto-generated method stub
		
	}

}
