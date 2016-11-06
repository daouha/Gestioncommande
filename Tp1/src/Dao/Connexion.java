package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
	
	private  String url="jdbc:mysql://localhost:3306/ventes";
	private String user ="root";
	private String pv="";
	Connection cn;
	Statement st;
	public Connexion()
	{
		
	}
	public Statement Cnx()
	{
		try{
			
		Class.forName("com.mysql.jdbc.Driver");
		try{cn=DriverManager.getConnection(url,user,pv);
		st=cn.createStatement();}
		catch(SQLException e){}
		
		}catch(ClassNotFoundException e){}
	return st;
	}

	

}
