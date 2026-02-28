import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        statement.setString(1, "John Doe");
        // Mutant: Replaced incorrect index '0' with '2'
        statement.setString(2, "john@example.com"); // Incorrectly replaced with 2 instead of 2

        statement.executeUpdate();
    }
}