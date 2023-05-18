package com.steepsouth.usermgmt.dao;

import com.steepsouth.usermgmt.model.User;

import java.sql.SQLException;
import java.util.List;


public class UserHibernateDAOImplementation implements UserDAOInterface{

	@Override
	public void insertUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User selectUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
