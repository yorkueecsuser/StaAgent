import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class SQLNonconstantQueryExample {
public static void showBug(String tableName , String userName){
    Connection connection = null;
    Statement statement = null;
    statement = null;
    try { connection = DriverManager.getConnection("jdbc:h2:mem:testdb" , "sa" , ""); statement = connection.createStatement(); String query = "SELECT * FROM " + tableName + " WHERE user_name = '" + userName + "'"; statement.execute(query); } catch(SQLException e){ e.printStackTrace(); } finally { try { if(statement != null){ statement.close(); } if(connection != null){ connection.close(); } } catch(SQLException e){ e.printStackTrace(); } }
}

    public static void main(String[] args) {
        // Demonstration of the bug
        showBug("Users", "admin");
    }
}