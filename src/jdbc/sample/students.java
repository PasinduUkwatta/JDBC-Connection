/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.sample.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Pasindu Thiwanka
 */
public class students {
    public static void getStudents(ResultSet rs) throws SQLException{
        while(rs.next()){
           StringBuffer stringBuffer = new StringBuffer();
           
           stringBuffer.append("Student ID"+"  "+rs.getInt("id")+"  ");
           stringBuffer.append("First Name"+"  "+rs.getString("first_name")+"  ");
           stringBuffer.append("Last Name"+"  "+rs.getString("last_name")+"  ");
           stringBuffer.append("Date of Birth"+"  "+rs.getDate("dob")+"  ");
           stringBuffer.append("Class"+"  "+rs.getInt("class")+"  ");
           stringBuffer.append("E-Mail "+"  "+rs.getString("email")+"  ");
           stringBuffer.append("Fee"+"  "+rs.getInt("fee")+"  ");
           
            System.out.println(stringBuffer.toString());
        }
    }
    
}

