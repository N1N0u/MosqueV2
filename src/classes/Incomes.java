package classes;

public class Incomes {
	private String nomI,prenomI,date,donationString;
	private int idDonateur;
	public Incomes() {}
	public Incomes (int id,String n,String p,String d,String don)
	{
		this.idDonateur=id;
		this.date=d;
		this.donationString=don;
		this.nomI=n;
		this.prenomI=p;
	}

	public String getNomI() {
		return nomI;
	}

	public void setNomI(String nomI) {
		this.nomI = nomI;
	}

	public String getPrenomI() {
		return prenomI;
	}

	public void setPrenomI(String prenomI) {
		this.prenomI = prenomI;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDonationString() {
		return donationString;
	}

	public void setDonationString(String donationString) {
		this.donationString = donationString;
	}
	public int getIdDonateur() {
		return idDonateur;
	}
	public void setIdDonateur(int idDonateur) {
		this.idDonateur = idDonateur;
	}
	

}
