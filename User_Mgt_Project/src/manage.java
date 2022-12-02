package com.manage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.managedao.UserDao;
import com.managedaoimpl.UserDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to User_Managment System APP " );
        
        UserDao us = new UserDaoImpl();
        
        System.out.println("1. To Create User:");
		System.out.println("2. To View User:");
		System.out.println("3. To View all User:");
		System.out.println("4. To Update User:");
		System.out.println("5. To Delete User:");
		System.out.println("6. To Exit:");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Choice :");
			int ch = scan.nextInt();
			int i ;
			switch (ch) {
			case 1: {
				i = us.insertUser(1,"Hamsworth", "pas124", "Mumbai");
				System.out.println(i + " record inserted..");
				break;
			}
			case 2:
				us.displayUser(4);
				break;
				
			case 3:
				us.displayAllUser();
				break;
				
			case 4: {
				i = us.updateUser(2, "Parker ");
				System.out.println(i + " record updated..");
				break;
				}
			
			case 5:
				{
				i=us.deleteUser(3);
				System.out.println(i +" record deleted..");
				break;
				}
				
			case 6:
				System.exit(0);

			default:
				System.out.println("Enter valid choice...");

			}

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}