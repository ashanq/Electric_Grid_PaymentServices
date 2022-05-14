package model;

import java.sql.Connection;

import com.PaymentAPI;
import com.mysql.cj.Session;

import java.sql.*;
import java.sql.Statement;
import java.util.Base64;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Payment {
	
	//A common method to connect to the DB
			private Connection connect()
			{
				Connection con = null;
				try
				{
					Class.forName("com.mysql.jdbc.Driver");

					//Provide the correct details: DBServer/DBName, username, password
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
				}
				catch (Exception e)
				{e.printStackTrace();}
				return con;
			}



}
