/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.sample.tables;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Pasindu Thiwanka
 */
public class AddStudents {
    public void add(String fname,String lname,String email,String dob){
        
        String sql = "insert into 'students'('id','fname','lname','email','DOB')values(?,?,?,?,?) )";
        
        try {
            Connection conn = dbUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(dob);
            stmt.setString(1, id);
            stmt.setString(1,fname );
            stmt.setString(2,lname );
            stmt.setString(3,email );
            stmt.setString(4,dob );
            
            stmt.execute();

            
        } catch (Exception e) {
        }
    }
    
}
