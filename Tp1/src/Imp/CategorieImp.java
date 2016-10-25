package Imp;

import java.sql.SQLException;
import java.sql.Statement;

import Dao.cnx;
import Dao.Categorie;;

public class CategorieImp {
 
	Statement st ;
	cnx cn=new cnx();
	public CategorieImp(){}
	
	public int Ajoutercata(Categorie c){
		int res=0;
		st=cn.getconnection();
		try{
		res=st.executeUpdate("insert into categorie values("+c.getCodecata()+",'"+c.getNomacata()+"')");
		
	}
		catch(SQLException e){}
		return res;
	}
	public int Supprimercata(Categorie c){
		int res=0;
		st=cn.getconnection();
		try{
		res=st.executeUpdate("delete from categorie where id="+c.getCodecata());
		
	}
		catch(SQLException e){}
		return res;
	}
		public int update(Categorie c){
			int res=0;
			st=cn.getconnection();
			try{
			res=st.executeUpdate("update categorie set codecat="+c.getCodecata()+", nom='"+c.getNomacata()+"' where id="+c.getCodecata());
			
		}
		catch(SQLException e){}
		return res;
	}
	
	
}
