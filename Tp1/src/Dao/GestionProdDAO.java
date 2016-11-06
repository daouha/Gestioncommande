package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class GestionProdDAO {
	private Statement st;
	private Connexion dao=new Connexion();
	
	public int insert(Produit p)
	{
		int res=0;
		try{
			st=dao.Cnx();
			res=st.executeUpdate("INSERT INTO produit Values("+p.getNumprod()+",'"+p.getLiblle()+"','"+p.getStock()+"','"+p.getPrixttc()+"','"+p.getPointprod()+"')");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
	}
	//modifier eya azzouzi
	public int update(Produit p)
	{
		int res=0;
		st=dao.Cnx();
		try{
			res=st.executeUpdate("update produit set NumProd='"+p.getNumprod()+"', Libelle='"+p.getLiblle()+"', Stock='"+p.getStock()+"', PrixTTC='"+p.getPrixttc()+"',PointProd='"+p.getPointprod()+"' where NumProd="+p.getNumprod());}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
	}
	
	public int delete(Produit p){
		int res=0;
		st=dao.Cnx();
		try{
		res=st.executeUpdate("delete from produit where NumProd="+p.getNumprod());
		
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
	}
		
	
	
	public List<Produit> selectAll()
	{
		ResultSet rs;
		List<Produit> liste =new ArrayList<Produit>();
		
		try{
			st=dao.Cnx();
			rs=st.executeQuery("SELECT * FROM produit");
			while(rs.next())
			{
				Produit prod=new Produit();
				
				prod.setNumprod(rs.getInt(1));
				prod.setLiblle(rs.getString(2));
				prod.setStock(rs.getInt(3));
				prod.setPrixttc(rs.getFloat(4));
				prod.setPointprod(rs.getInt(5));
				
				liste.add(prod);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return liste;
		
	}
}
