import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // Original bug
        statement.setString(0, "John Doe"); // should be 1
        // Mutated code: Duplicated the line below the original line
        statement.setString(0, "John Doe"); // should be 1 (duplication)

        statement.setString(0, "john@example.com"); // should be 2
        // Mutated code: Duplicated the line below the original line
        statement.setString(0, "john@example.com"); // should be 2 (duplication)

        statement.executeUpdate();
    }
}