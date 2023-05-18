package com.steepsouth.usermgmt.dao;

import com.steepsouth.usermgmt.model.User;

import java.sql.SQLException;
import java.util.List;


public interface UserDAOInterface {

	public void insertUser(User user) throws SQLException ;
	public User selectUser(int id);
	public List<User> selectAllUsers();
	public boolean deleteUser(int id) throws SQLException;
	public boolean updateUser(User user) throws SQLException;
	
}
