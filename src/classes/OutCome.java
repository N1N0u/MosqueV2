package classes;

public class OutCome {
	private int idS;
	private String nomS,prenomS,dateS,montant;
	
	public OutCome() {}
	
	public OutCome(int id,String n,String p,String d,String m) 
	{
		this.idS=id;
		this.nomS=n;
		this.prenomS=p;
		this.dateS=d;
		this.montant=m;
	}
	public int getIdS() {
		return idS;
	}
	public void setIdS(int idS) {
		this.idS = idS;
	}
	public String getNomS() {
		return nomS;
	}
	public void setNomS(String nomS) {
		this.nomS = nomS;
	}
	public String getPrenomS() {
		return prenomS;
	}
	public void setPrenomS(String prenomS) {
		this.prenomS = prenomS;
	}
	public String getDateS() {
		return dateS;
	}
	public void setDateS(String dateS) {
		this.dateS = dateS;
	}
	public String getMontant() {
		return montant;
	}
	public void setMontant(String montant) {
		this.montant = montant;
	}
	

}
