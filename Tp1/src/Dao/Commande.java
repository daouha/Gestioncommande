package Dao;

import java.sql.Date;

public class Commande {
	private String numcmd;
	private Date datecmd;
	
	
	
	public String getNumcmd() {
		return numcmd;
	}
	public void setNumcmd(String numcmd) {
		this.numcmd = numcmd;
	}
	public Date getDatecmd() {
		return datecmd;
	}
	public void setDatecmd(Date datecmd) {
		this.datecmd = datecmd;
	}
	public Commande(String numcmd, Date datecmd) {
		super();
		this.numcmd = numcmd;
		this.datecmd = datecmd;
	}
	public Commande() {
		super();
	}
	@Override
	public String toString() {
		return "Commande [numcmd=" + numcmd + ", datecmd=" + datecmd + "]";
	}
	public void Modifiercmd()
	{ }
	public void supprimercmd()
	{ }
	public void ajoutercmd()
	{ }

public int 	creer()
{return 0;}
public int 	etat()
{return 0;}
}
