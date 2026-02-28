import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // Original bug line with correct index
        statement.setString(1, "John Doe");
        statement.setString(2, "john@example.com");

        // Mutated code
        String a = "John Smith";
        String b = "johnsmith@example.com";
        statement.setString(0, a); // Mutated line with incorrect index
        statement.setString(0, b); // Mutated line with incorrect index

        statement.executeUpdate();
    }
}