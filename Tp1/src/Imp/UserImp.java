package Imp;

import java.sql.SQLException;
import java.sql.Statement;

import Dao.cnx;
import Dao.User;

public class UserImp {
	Statement st ;
	cnx cn=new cnx();
	public int delete(User u){
		int res=0;
		st=cn.getconnection();
		try{
		res=st.executeUpdate("delete from User where id="+u.getLogin());
		
	}
		catch(SQLException e){}
		return res;
	}
	public void Supprimerordre()
	{ }
}
