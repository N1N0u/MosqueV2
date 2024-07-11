package classes;

public class User {
	private String psydo,password;
	public User() {}
	public User(String psydo,String password) 
	{
		this.setPsydo(psydo);
		this.setPassword(password);
	}
	public String getPsydo() {
		return psydo;
	}
	public void setPsydo(String psydo) {
		this.psydo = psydo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
