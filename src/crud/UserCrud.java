package crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import classes.User;
import classes.sqlConnection;

public class UserCrud {
	public User getUser(String p, String pass) throws SQLException
	{
		User u=null;
		String sql="select * from Users where psydo='"+p+"' and password='"+pass+"'";
		System.out.println(sql);
		Connection con= sqlConnection.conector();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		while(rs.next()){
		u=new User(rs.getString("psydo"),rs.getString("password"));
		}
		con.close();
		return u;
	}
	
	
	
}
