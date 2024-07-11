package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import classes.Incomes;
import classes.OutCome;
import classes.sqlConnection;

public class OutcomeCrud {

	public void AddOutcome(OutCome o) throws ClassNotFoundException, SQLException
	{
		String sql="insert into Out (nomS,prenomS,dateS,Montant) values('"+o.getNomS()+"','"+o.getPrenomS()+"'"
				+ ",'"+o.getDateS()+"','"+o.getMontant()+"')";
		sqlConnection.executeSQLQuery(sql);
	}
	
	public Vector getAllOutCums() throws SQLException
	{
		Vector vector=new Vector();
		String sql="select * from Out";
		Connection con= sqlConnection.conector();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			vector.addElement(new OutCome(rs.getInt("idS"), rs.getString("nomS"), rs.getString("prenomS"),
					rs.getString("dateS"), rs.getString("Montant")));
		}
		con.close();
		return vector;
	}
	public Vector getAllDonationsByDtae (String d) throws SQLException
	{
		Vector vector=new Vector();
		String sql="select * from Out where date='"+d+"'";
		Connection con= sqlConnection.conector();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
//		while(rs.next())
//		{
//			vector.addElement(new Incomes(rs.getInt("idDonateur"),rs.getString("nomD"),rs.getString("prenomD"),
//					rs.getString("date"),rs.getString("donation")));
//		}
		con.close();
		return vector;
	}
}
