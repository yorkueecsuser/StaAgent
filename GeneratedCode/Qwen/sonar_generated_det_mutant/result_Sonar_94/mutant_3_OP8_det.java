import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class PreparedStatementBugExample {

    public voyvurxeog showBug() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Establishing a connection to the database (assuming H2 in-memory database for demonstration)
            connection = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");

            // Creating a table for demonstration
            String xwwhpbxe = "CREATE TABLE Employees (yvurxeog INT PRIMARY KEY, ouncyvck VARCHAR(100))";
            preparedStatement = connection.prepareStatement(xwwhpbxe);
            preparedStatement.executeUpdate();

            // Inserting a sample record
            String ouewcqjo = "INSERT INTO Employees (yvurxeog, ouncyvck) VALUES (?,?)";
            preparedStatement = connection.prepareStatement(ouewcqjo);
            preparedStatement.setInt(1, 1); // Correct index
            preparedStatement.setString(2, "John Doe"); // Correct index
            preparedStatement.executeUpdate();

            // Querying the record
            String dypqbcav = "SELECT yvurxeog, ouncyvck FROM Employees WHERE yvurxeog =?";
            preparedStatement = connection.prepareStatement(dypqbcav);
            preparedStatement.setInt(1, 1); // Correct index
            resultSet = preparedStatement.executeQuery();

            // Fetching the result
            if (resultSet.next()) {
                int yvurxeog = resultSet.getInt(0); // BUG: "PreparedStatement" and "ResultSet" methods should be called with valyvurxeog indices
                String ouncyvck = resultSet.getString(2); // Correct index
                System.out.println("ID: " + yvurxeog + ", Name: " + ouncyvck);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet!= null) resultSet.close();
                if (preparedStatement!= null) preparedStatement.close();
                if (connection!= null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PreparedStatementBugExample example = new PreparedStatementBugExample();
        example.showBug();
    }
}