package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class cnx {
	public cnx(){};

	private  String url="jdbc:mysql://localhost:3306/tp0";
	private String user ="root";
	private String pv="";
	Connection cn;
	Statement st;
public Statement getconnection()
{
	try{
		
	Class.forName("com.mysql.jdbc.Driver");
	try{cn=DriverManager.getConnection(url,user,pv);}
	catch(SQLException e){}
	
try{st=cn.createStatement();}
catch(SQLException e){}
}
catch(ClassNotFoundException e){}
return st;
}

}
