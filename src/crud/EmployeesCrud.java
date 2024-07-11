package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import classes.Employees;
import classes.sqlConnection;

public class EmployeesCrud {
	
	public void AddEmp(Employees ee) throws ClassNotFoundException, SQLException
	{
		String sqlString="insert into Emplyes (nomE,prenomE,dateNaisE,posteE)"
				+ "values ('"+ee.getNomE()+"','"+ee.getPrenomE()+"','"+ee.getDateNaisE()+"','"+ee.getPosteE()+"')";
		sqlConnection.executeSQLQuery(sqlString);
	}
	public Vector getAllEmp() throws SQLException
	{
		Vector empVector=new Vector();
		
		String sql="select * from Emplyes";
		
		Connection con= sqlConnection.conector();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()){
			empVector.addElement(new Employees(rs.getInt("idE"), rs.getString("nomE"), rs.getString("prenomE")
					, rs.getString("dateNaisE"), rs.getString("posteE")));
		}
		con.close();
		return empVector;
	}
	public Employees getEmpById(int id) throws SQLException
	{
		Employees employees=null;
		
		String sql="select * from Emplyes where idE='"+id+"'";
		
		Connection con= sqlConnection.conector();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()){
			employees=(new Employees(rs.getInt("idE"), rs.getString("nomE"), rs.getString("prenomE")
					, rs.getString("dateNaisE"), rs.getString("posteE")));
		}
		con.close();
		return employees;
	}
	public void UpdateEmp(Employees emp) throws ClassNotFoundException, SQLException
	{
		String sqlString="update Emplyes set nomE='"+emp.getNomE()+"',prenomE='"+emp.getPrenomE()+"',"
				+ "dateNaisE='"+emp.getDateNaisE()+"',posteE='"+emp.getPosteE()+"' where idE='"+emp.getIdE()+"'";
		sqlConnection.executeSQLQuery(sqlString);
	}
	
	public void DelEmp(int id) throws ClassNotFoundException, SQLException
	{
		String sqlString="delete from Emplyes where idE='"+id+"'";
		sqlConnection.executeSQLQuery(sqlString);
	}
}
