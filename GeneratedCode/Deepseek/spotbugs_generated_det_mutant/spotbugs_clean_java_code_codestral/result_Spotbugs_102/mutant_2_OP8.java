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
        statement.setString(1, "john@example.com"); // should be 2, changed from 0 to 1

        statement.executeUpdate();
    }

    // Mutant code
    public void mutatedShowBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        stmt.setString(0, "John Doe"); // should be 1
        stmt.setString(1, "john@example.com"); // should be 2, changed from 0 to 1

        stmt.executeUpdate();
    }
}