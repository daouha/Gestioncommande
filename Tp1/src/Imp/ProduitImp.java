package Imp;

	import Dao.Produit;
	import Dao.cnx;

	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

public class ProduitImp {

		Statement st ;
		cnx cn=new cnx();
		public ProduitImp(){}
		
		public int ajoutercmd(Produit p){
			int res=0;
			st=cn.getconnection();
			try{
			res=st.executeUpdate("insert into Produit values("+p.getNumprod()+",'"+p.getLiblle()+"',"+p.getPointprod()+","+p.getStock()+","+p.getPrixttc()+")");
			
		}
			catch(SQLException e){}
			return res;
		}
		public int supprimercmd(Produit p){
			int res=0;
			st=cn.getconnection();
			try{
			res=st.executeUpdate("delete from Produit where id="+p.getNumprod());
			
		}
			catch(SQLException e){}
			return res;
		}
			public int Modifiercmd(Produit p){
				int res=0;
				st=cn.getconnection();
				try{
				res=st.executeUpdate("update Produit set numprod="+p.getNumprod()+", libelle='"+p.getLiblle()+"',pointprod"+p.getPointprod()+",stock"+p.getStock()+",prixttc"+p.getPrixttc()+" where id="+p.getNumprod());
				
			}
			catch(SQLException e){}
			return res;
		}
	}


