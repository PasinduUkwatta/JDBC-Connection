package jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jdbc.sample.tables.students;
/**
 *
 * @author Pasindu Thiwanka
 */
public class JDBCSample {

   
    
    private static final String SQL ="SELECT id,fee From students WHERE fee <=?";
    
    public static void main(String[] args) throws SQLException {
       
        
       //we should use this code for older jdk versions
       // class.forName(com.mysql.jdbc.Driver);
        
        double maxFee;
        
        try {
            maxFee = Input.getInt("Enter a maximum fee :");
            
        } catch (Exception e) {
            System.out.println("Error");
            return;
        }
        
        ;
       
        
        try {
            
              Connection con = DBConnection.getConnection();
              Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
              ResultSet rs = stmt.executeQuery("select * from students");
              students.getStudents(rs);
                
               rs.first();
                
                //this code will provide the details of the first student
                System.out.println("First Student is :"+rs.getInt("id")+"  "+rs.getString("first_name")+"  "+rs.getString("last_name"));
                
              
              
                rs.last();
                
                //this code will provide the details of the last student
                System.out.println("Last Student is :"+rs.getInt("id")+"  "+rs.getString("first_name")+"  "+rs.getString("last_name"));
                
                 rs.absolute(3);
                
                //this code will provide the details of the third student
                System.out.println("Third Student is :"+rs.getInt("id")+"  "+rs.getString("first_name")+"  "+rs.getString("last_name"));
                
                
                
                
                //this will provide the sign that we are connected to the database
                System.out.println("connected");
                //System.err.println(rs.getRow());
               
        
        
        } 
        catch (SQLException e) {
                System.out.println(e.getMessage());
        }
        //finally{
            
            //we need to consider the way we connect to the database while we closing
            //we need to disconnect the last one at the first
            //first one at the last
            
            /*
            con
            stmt
            rs
            -------
            rs
            stmt
            con  
           */
//            
//                if(rs!=null){
//                    rs.close();
//                }
//                
//                 
//                if(stmt!=null){
//                   stmt.close();
//                }
//            
//                if (con!=null){
//                con.close();
//               
                
               
            }
        
       
    }
    

