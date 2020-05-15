
package jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pasindu Thiwanka
 */
public class DBConnection {
    
    private static final String USERNAME = "pasindu";
    private static final String PASSWORD = "1234";
    private static final String CONN = "jdbc:mysql://localhost/school";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
    } 
}
