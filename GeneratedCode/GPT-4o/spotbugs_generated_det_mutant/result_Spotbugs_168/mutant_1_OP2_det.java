import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class SqlInjectionDemo {
public String showBug(String userInput){
    Connection connection = null;
    connection = null;
    PreparedStatement preparedStatement = null;
    String result = "Query prepared successfully.";
    try { connection = DriverManager.getConnection("jdbc:mysql://localhost/testdb" , "user" , "password"); String sqlQuery = "SELECT * FROM users WHERE username = '" + userInput + "'"; preparedStatement = connection.prepareStatement(sqlQuery); } catch(SQLException e){ result = "SQLException occurred: " + e.getMessage(); } finally { try { if(preparedStatement != null){ preparedStatement.close(); } if(connection != null){ connection.close(); } } catch(SQLException e){ result = "SQLException occurred during cleanup: " + e.getMessage(); } }
    return result;
}
}