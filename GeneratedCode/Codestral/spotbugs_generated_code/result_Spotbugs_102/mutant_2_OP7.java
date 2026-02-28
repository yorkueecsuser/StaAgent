import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    // Method to return a false condition for the while loop
    private boolean getCondition() {
        return false;
    }

    public void showBug() throws SQLException {
        while (getCondition()) { // Unreachable while loop
            // This loop will never execute because getCondition() always returns false
        }

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
        statement.setString(0, "John Doe"); // should be 1
        statement.setString(0, "john@example.com"); // should be 2

        statement.executeUpdate();
    }
}