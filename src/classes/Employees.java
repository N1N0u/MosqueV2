package classes;

public class Employees {
	
	public Employees () {}
	public Employees (int id,String nom,String prenom,String dateNaissance,String poste) 
	{
	this.idE=id;
	this.dateNaisE=dateNaissance;
	this.nomE=nom;
	this.prenomE=prenom;
	this.posteE=poste;
	}
	
	public int getIdE() {
		return idE;
	}
	public void setIdE(int idE) {
		this.idE = idE;
	}
	public String getNomE() {
		return nomE;
	}
	public void setNomE(String nomE) {
		this.nomE = nomE;
	}
	public String getPrenomE() {
		return prenomE;
	}
	public void setPrenomE(String prenomE) {
		this.prenomE = prenomE;
	}
	public String getDateNaisE() {
		return dateNaisE;
	}
	public void setDateNaisE(String dateNaisE) {
		this.dateNaisE = dateNaisE;
	}
	public String getPosteE() {
		return posteE;
	}
	public void setPosteE(String posteE) {
		this.posteE = posteE;
	}
	private int idE;
	private String nomE,prenomE,dateNaisE,posteE;
	
	

}
