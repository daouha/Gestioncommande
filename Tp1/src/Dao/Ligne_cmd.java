package Dao;

public class Ligne_cmd {
	private int qtecmd;
	private int pointtot;
	private int prixtot;
	public Ligne_cmd(int qtecmd, int pointtot, int prixtot) {
		super();
		this.qtecmd = qtecmd;
		this.pointtot = pointtot;
		this.prixtot = prixtot;
	}
	public Ligne_cmd() {
		super();
	}
	public int getQtecmd() {
		return qtecmd;
	}
	public void setQtecmd(int qtecmd) {
		this.qtecmd = qtecmd;
	}
	public int getPointtot() {
		return pointtot;
	}
	public void setPointtot(int pointtot) {
		this.pointtot = pointtot;
	}
	public int getPrixtot() {
		return prixtot;
	}
	public void setPrixtot(int prixtot) {
		this.prixtot = prixtot;
	}
	@Override
	public String toString() {
		return "Ligne_cmd [qtecmd=" + qtecmd + ", pointtot=" + pointtot
				+ ", prixtot=" + prixtot + "]";
	}
	
	
}
