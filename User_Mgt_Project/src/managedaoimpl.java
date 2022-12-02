package com.managedaoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import com.manageconnection.ConnectionProvider;
import com.managedao.UserDao;

public class UserDaoImpl implements UserDao {
	Connection con = ConnectionProvider.getConnection();

      //insert user
	  public int insertUser(String uname, int uid, String upassword, String ucity) throws SQLException {
		String query = "insert into user(uid,uname,upassword,ucity) values('" + uid + "'," + uname + "," + upassword
				+ " ," + ucity + ")";
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate(query);
		return i;
	}

	// display user
	public void displayUser(int uid) throws SQLException {
		String query="Select * from user where uid="+uid;
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println("uid :"+rs.getInt(1));
			System.out.println("uName :"+rs.getString(2));
			System.out.println("upassword :"+rs.getString(3));
			System.out.println("ucity :"+rs.getString(4));
			System.out.println("......................................................");
		}
		
	}
	// display all user
	public void displayAllUser() throws SQLException {
		String query="Select * from user";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println("uid :"+rs.getInt(1));
			System.out.println("uName :"+rs.getString(2));
			System.out.println("upassword :"+rs.getString(3));
			System.out.println("ucity :"+rs.getString(4));
			System.out.println("......................................................");
		}
		
	}

	// update user
	public int updateUser(int uid, String uname) throws SQLException {
		String query = "update user set uname='" + uname + "' where uid=" + uid;
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate(query);
		return i;
	}

	// delete user
	public int deleteUser(int uid) throws SQLException {
		String query = "delete from  user where uid=" + uid;
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate(query);
		return i;
	}

	public int insertUser(int uid, String uname, String upassword, String ucity) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}