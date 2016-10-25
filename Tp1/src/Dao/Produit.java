package Dao;

public class Produit {
private int numprod;
private String liblle;
private int stock;
private Float prixttc;
private int pointprod;
public Produit(int numprod, String liblle, int stock, Float prixttc,
		int pointprod) {
	super();
	this.numprod = numprod;
	this.liblle = liblle;
	this.stock = stock;
	this.prixttc = prixttc;
	this.pointprod = pointprod;
}
public Produit() {
	super();
}
public int getNumprod() {
	return numprod;
}
public void setNumprod(int numprod) {
	this.numprod = numprod;
}
public String getLiblle() {
	return liblle;
}
public void setLiblle(String liblle) {
	this.liblle = liblle;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public Float getPrixttc() {
	return prixttc;
}
public void setPrixttc(Float prixttc) {
	this.prixttc = prixttc;
}
public int getPointprod() {
	return pointprod;
}
public void setPointprod(int pointprod) {
	this.pointprod = pointprod;
}
@Override
public String toString() {
	return "Produit [numprod=" + numprod + ", liblle=" + liblle + ", stock="
			+ stock + ", prixttc=" + prixttc + ", pointprod=" + pointprod + "]";
}


public void Ajouterprod()
{ }
public void Supprimerprod()
{ }
public void Modifierprod()
{ }
}
