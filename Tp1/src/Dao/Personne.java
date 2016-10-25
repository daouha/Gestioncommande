package Dao;

import java.sql.Date;

public class Personne {
	
	private int id_user;
	private String nom;
	private String prenom;
	private Date date_naiss;
	private String questsec;
	private int point_user;
	
	
	
	public String toString() {
		return "Personne [id_user=" + id_user + ", nom=" + nom + ", prenom="
				+ prenom + ", date_naiss=" + date_naiss + ", questsec="
				+ questsec + ", point_user=" + point_user + "]";
	}
	public Personne() {
		super();
	}
	public Personne(int id_user, String nom, String prenom, Date date_naiss,
			String questsec, int point_user) {
		super();
		this.id_user = id_user;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naiss = date_naiss;
		this.questsec = questsec;
		this.point_user = point_user;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naiss() {
		return date_naiss;
	}
	public void setDate_naiss(Date date_naiss) {
		this.date_naiss = date_naiss;
	}
	public String getQuestsec() {
		return questsec;
	}
	public void setQuestsec(String questsec) {
		this.questsec = questsec;
	}
	public int getPoint_user() {
		return point_user;
	}
	public void setPoint_user(int point_user) {
		this.point_user = point_user;
	}
}
