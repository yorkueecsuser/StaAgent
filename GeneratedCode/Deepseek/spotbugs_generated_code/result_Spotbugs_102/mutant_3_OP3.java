import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
        statement.setString(0, "John Doe"); // should be 1
        statement.setString(0, "john@example.com"); // should be 2

        // Mutation: Unreachable if statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never be executed because getCondition() always returns false
            int i = 10 / 0; // This will cause an ArithmeticException if the code reaches here
        }

        statement.executeUpdate();
    }

    private boolean getCondition() {
        return false;
    }
}