import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class SQLNonconstantQueryExample {

    public static void showBug(String tableName, String userName) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Establishing a connection
            connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");

            // Creating a statement
            statement = connection.createStatement();

            // Dynamically generated SQL query
            // BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)
            String query = "SELECT * FROM " + tableName + " WHERE user_name = '" + userName + "'";

            // Execute the query
            statement.execute(query); // BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Demonstration of the bug
        showBug("Users", "admin");
    }
}