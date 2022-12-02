package com.managedao;

import java.sql.SQLException;

public interface UserDao {
	//to insert user
		int insertUser(int uid,String uname,String upassword,String ucity) throws SQLException;
		
		//to display user
		void displayUser(int uid) throws SQLException;
		
		//to display all students
		void displayAllUser() throws SQLException;
		
		//to update user
		int updateUser(int uid,String uame) throws SQLException;
		
		//to delete user
		int deleteUser(int uid) throws SQLException;
		

	}