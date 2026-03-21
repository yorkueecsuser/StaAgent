import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class SQLNonConstantStringExample {
public void showBug(String userInput)throws SQLException {
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase" , "user" , "password");
    Statement statement = connection.createStatement();
    statement = connection.createStatement();
    String sqlQuery = "SELECT * FROM users WHERE username = '" + userInput + "'";
    statement.execute(sqlQuery);
    statement.close();
    connection.close();
}
}