package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import classes.Incomes;

import classes.sqlConnection;

public class IncomeCrud {
	
	public void AddIncome(Incomes i) throws ClassNotFoundException, SQLException
	{
		String sql="insert into Incomes (nomD,prenomD,date,donation) values ('"+i.getNomI()+"','"+i.getPrenomI()+"'"
				+ ",'"+i.getDate()+"','"+i.getDonationString()+"')";
		sqlConnection.executeSQLQuery(sql);
	}
	
	public Vector getAllDonations() throws SQLException
	{
		Vector vector=new Vector();
		String sql="select * from Incomes";
		Connection con= sqlConnection.conector();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			vector.addElement(new Incomes(rs.getInt("idDonateur"),rs.getString("nomD"),rs.getString("prenomD"),
					rs.getString("date"),rs.getString("donation")));
		}
		con.close();
		return vector;
	}
	public Vector getAllDonationsByDtae (String d) throws SQLException
	{
		Vector vector=new Vector();
		String sql="select * from Incomes where date='"+d+"'";
		Connection con= sqlConnection.conector();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			vector.addElement(new Incomes(rs.getInt("idDonateur"),rs.getString("nomD"),rs.getString("prenomD"),
					rs.getString("date"),rs.getString("donation")));
		}
		con.close();
		return vector;
	}
	public int getLastId() throws SQLException
	{
		int id=0;
		String sql="select MAX(idDonateur) as id from Incomes";
		Connection con= sqlConnection.conector();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next())
		{
			id=rs.getInt("id");
		}
		con.close();
		return id;
	}
}
