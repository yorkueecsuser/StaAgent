import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class PreparedStatementBugExample {
public void showBug() {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    preparedStatement = null;
    ResultSet resultSet = null;
    try { connection = DriverManager.getConnection("jdbc:h2:mem:test" , "sa" , ""); String createTableSQL = "CREATE TABLE Employees (id INT PRIMARY KEY, name VARCHAR(100))"; preparedStatement = connection.prepareStatement(createTableSQL); preparedStatement.executeUpdate(); String insertSQL = "INSERT INTO Employees (id, name) VALUES (?,?)"; preparedStatement = connection.prepareStatement(insertSQL); preparedStatement.setInt(1 , 1); preparedStatement.setString(2 , "John Doe"); preparedStatement.executeUpdate(); String selectSQL = "SELECT id, name FROM Employees WHERE id =?"; preparedStatement = connection.prepareStatement(selectSQL); preparedStatement.setInt(1 , 1); resultSet = preparedStatement.executeQuery(); if(resultSet.next()){ int id = resultSet.getInt(0); String name = resultSet.getString(2); System.out.println("ID: " + id + ", Name: " + name); } } catch(SQLException e){ e.printStackTrace(); } finally { try { if(resultSet != null)resultSet.close(); if(preparedStatement != null)preparedStatement.close(); if(connection != null)connection.close(); } catch(SQLException e){ e.printStackTrace(); } }
}

    public static void main(String[] args) {
        PreparedStatementBugExample example = new PreparedStatementBugExample();
        example.showBug();
    }
}