package com.test.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.test.model.User;

public class UserExtractor  implements ResultSetExtractor<User> {

	@Override
	public User extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
	   User user = new User();
	   
	   user.setUSER_ID(resultSet.getString(1));
	   user.setIP_ADDRESS(resultSet.getString(2));
	   user.setHOST_NAME(resultSet.getString(3));
	   user.setTOKEN(resultSet.getDate(4));
	   user.setLAST_UPD_DATE(resultSet.getString(5));
	   
	   
	   return user;
	}

}
