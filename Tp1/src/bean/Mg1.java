package bean;

import java.util.ArrayList;
import java.util.List;

import Dao.Categorie;


public class Mg1 {
	
	Categorie cat=new Categorie();
private  Categorie c=new Categorie();
public Mg1(){}
public Categorie getc(){return c;}
public void setp(Categorie c1){c=c1;};



public String inserer(){
	Categorie a;
	if(cat.Ajoutercata(c) ==0)
	{System.out.print("nooooo");}
	else  System.out.print("yessss");
	return "";
}
public String delete(){
	if(cat.Supprimercata(c)==0)
	{System.out.print("introuvable");}
	else  System.out.print("tache effectuer");
	return "";
}
public String update(){
	if(cat.Modifiercata(c)==0)
	{System.out.print("introuvable");}
	else  System.out.print("tache effectuer");
	return "";
}
public Categorie getCat() {
	return cat;
}
public void setCat(Categorie cat) {
	this.cat = cat;
}
public Categorie getC() {
	return c;
}
public void setC(Categorie c) {
	this.c = c;
}






}
