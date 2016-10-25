package Dao;

public class Categorie {
private int codecata;
private String nomacata;
public Categorie(int codecata, String nomacata) {
	super();
	this.codecata = codecata;
	this.nomacata = nomacata;
}
public int getCodecata() {
	return codecata;
}
public void setCodecata(int codecata) {
	this.codecata = codecata;
}
public String getNomacata() {
	return nomacata;
}
public void setNomacata(String nomacata) {
	this.nomacata = nomacata;
}
public Categorie() {
	super();
}
@Override
public String toString() {
	return "Categorie [codecata=" + codecata + ", nomacata=" + nomacata + "]";
}
public int Modifiercata (Categorie c){return 0;}
public int Supprimercata (Categorie c){return 0;}
public int Ajoutercata (Categorie c){return 0;}



}
