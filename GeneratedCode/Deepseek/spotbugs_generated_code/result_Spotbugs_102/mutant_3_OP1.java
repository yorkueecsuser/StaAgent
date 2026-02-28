import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // Dead Store: Adding an unused variable declaration
        String unusedVar = "This variable is not used";

        // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
        statement.setString(0, "John Doe"); // should be 1
        statement.setString(0, "john@example.com"); // should be 2

        statement.executeUpdate();
    }
}