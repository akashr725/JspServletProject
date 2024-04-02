package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DataBaseConnection.ConnectionProvider;
import beans.RegisterBeans;

public class LoginDao {
	
	public String save(RegisterBeans lgb) {
		
		String name=lgb.getName();
		String number=lgb.getRollno();
		int rno=Integer.parseInt(number);
		PreparedStatement ps;
		try {
			ps = ConnectionProvider.getConnection().prepareStatement("select * from studentdetaiis where Name=? and RollNo=?");
			
			ps.setString(1, name);
			ps.setInt(2, rno);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				return "success";	
			}
			else {
				return "fail";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";

		
	}

}
