import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
public void showBug() throws SQLException {
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test" , "username" , "password");
    PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");
    statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");
    statement.setString(0 , "John Doe");
    statement.setString(0 , "john@example.com");
    statement.executeUpdate();
}
}