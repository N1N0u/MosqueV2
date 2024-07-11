package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class sqlConnection {
	Connection con=null;
	public static Connection conector()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			Connection con=DriverManager.getConnection("jdbc:sqlite:\\Errors\\Mosque.error");
			System.out.println("connected");
			return con;
		}catch(Exception e){ JOptionPane.showMessageDialog(null, e); 
		System.out.println("error");
		return null;}
	}
	public static void executeSQLQuery (String sql) throws ClassNotFoundException, SQLException {
        Connection con = conector();
        Statement st = con.createStatement();
        int n = st.executeUpdate(sql);
        st.close();
        con.close();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sqlConnection.conector();
		
	}

	

}