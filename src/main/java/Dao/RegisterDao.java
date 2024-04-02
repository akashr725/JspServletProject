package Dao;

import java.sql.PreparedStatement;
import DataBaseConnection.ConnectionProvider;
import beans.RegisterBeans;

public class RegisterDao {
	public String saveReg(RegisterBeans rgb) {
		
		String name=rgb.getName();
		String rno=rgb.getRollno();
		int rollno=Integer.parseInt(rno);
		String birthday=rgb.getBirthday();
		String course=rgb.getCourse();
		String gender=rgb.getGender();
		String phone=rgb.getPhone();
		String village=rgb.getVillage();
		String ps=rgb.getPs();
		String city=rgb.getCity();
		String district=rgb.getDistrict();
		String state=rgb.getState();
		String pincode=rgb.getPincode();
		String email=rgb.getEmail();
		
		
		try {
			
			PreparedStatement pst=ConnectionProvider.getConnection().prepareStatement("insert into studentdetaiis values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			pst.setString(1, name);
			pst.setInt(2, rollno);
			pst.setString(3, birthday);
			pst.setString(4, course);
			pst.setString(5, gender);
			pst.setString(6, phone);
			pst.setString(7, village);
			pst.setString(8, ps);
			pst.setString(9, city);
			pst.setString(10, district);
			pst.setString(11, state);
			pst.setString(12, pincode);
			pst.setString(13, email);
			int i=pst.executeUpdate();
			if(i>0) {
				
				return "success";
				
			}
			else {
				
				return "fail";
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "fail";
	}
	
	

}
