package Dao;

public class Admin {
	private String login;
	private String pwd;
	  
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Admin(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [login=" + login + ", pwd=" + pwd + "]";
	}
	

	
}
