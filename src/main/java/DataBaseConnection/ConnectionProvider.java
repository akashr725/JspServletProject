package DataBaseConnection;
import java.sql.*;

public class ConnectionProvider {
	public static Connection con=null;

private ConnectionProvider() {
	
}

public static Connection getConnection() {
	
	try {
		
		Class.forName(DataBaseDetails.DataBase_Driver);
		con=DriverManager.getConnection(DataBaseDetails.DataBase_Url,DataBaseDetails.DataBase_UserName,DataBaseDetails.DataBase_Password);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return con;
}

}
