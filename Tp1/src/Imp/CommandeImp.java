package Imp;





import Dao.Commande;
import Dao.cnx;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CommandeImp {

	Statement st ;
	cnx cn=new cnx();
	public CommandeImp(){}
	
	public int ajoutercmd(Commande c){
		int res=0;
		st=cn.getconnection();
		try{
		res=st.executeUpdate("insert into Commande values("+c.getNumcmd()+",'"+c.getDatecmd()+"')");
		
	}
		catch(SQLException e){}
		return res;
	}
	public int supprimercmd(Commande c){
		int res=0;
		st=cn.getconnection();
		try{
		res=st.executeUpdate("delete from Commande where id="+c.getNumcmd());
		
	}
		catch(SQLException e){}
		return res;
	}
		public int Modifiercmd(Commande c){
			int res=0;
			st=cn.getconnection();
			try{
			res=st.executeUpdate("update Commande set numcmd="+c.getNumcmd()+", prenom='"+c.getDatecmd()+"' where id="+c.getNumcmd());
			
		}
		catch(SQLException e){}
		return res;
	}
}
