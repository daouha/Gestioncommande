package bean;



import Dao.Categorie;
import Imp.CategorieImp;


public class Mg {
	CategorieImp a=new CategorieImp();
	Categorie cat=new Categorie();
private  Categorie c=new Categorie();

public Mg() {
	super();
}
public Categorie getc(){return c;};
public void setp(Categorie c1){c=c1;};



public String inserer(){
	
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
