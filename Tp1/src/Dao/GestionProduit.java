package DAO;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;



public class GestionProduit {
	
	private Produit prod=new Produit();
	private List<Produit> prods=new ArrayList<Produit>();
	private GestionProdDAO dao=new GestionProdDAO();
	
	GestionProduit()
	{
		
	}
	public Produit getProd() {
		return prod;
	}

	public void setProd(Produit prod) {
		this.prod = prod;
	}

	public List<Produit> getProds() {
		prods=dao.selectAll();
		return prods;
	}

	public void setProds(List<Produit> prods) {
		this.prods = prods;
	}

	public GestionProdDAO getDao() {
		return dao;
	}

	public void setDao(GestionProdDAO dao) {
		this.dao = dao;
	}
	
	public String insert()
	{
		if(dao.insert(prod)==0)
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Ajouter","Insertion non effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		else
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Ajouter","Insertion effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "mmm";
		
		
	}
	
	public String update()
	{
		if(dao.update(prod)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modification non effetctu�e");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modificatio non effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			}
		
		return "mmm";
		
		
	}
	
	public String delete()
	{
		if(dao.delete(prod)==0)
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Supp","Suppression non effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
			
		else
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_INFO,"Supp","Suppression  effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
		}
		return "mmm";
		
		
	}
	

}
