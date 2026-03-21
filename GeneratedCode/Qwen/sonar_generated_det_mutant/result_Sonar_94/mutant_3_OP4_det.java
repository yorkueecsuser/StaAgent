import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class PreparedStatementBugExample {

    public void showBug() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Establishing a connection to the database (assuming H2 in-memory database for demonstration)
            connection = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");

            // Creating a table for demonstration
            String createTableSQL = "CREATE TABLE Employees (id INT PRIMARY KEY, name VARCHAR(100))";
            preparedStatement = connection.prepareStatement(createTableSQL);
            preparedStatement.executeUpdate();

            // Inserting a sample record
            String insertSQL = "INSERT INTO Employees (id, name) VALUES (?,?)";
            preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setInt(1, 1); // Correct index
            preparedStatement.setString(2, "John Doe"); // Correct index
            preparedStatement.executeUpdate();

            // Querying the record
            String selectSQL = "SELECT id, name FROM Employees WHERE id =?";
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, 1); // Correct index
            resultSet = preparedStatement.executeQuery();

            // Fetching the result
            if (true && false && true && true && true && false && true && true && false && true && false) {short fkhwtltv = -9804;}else{short xbbklvni = 371;}
            if (resultSet.next()) {
                int id = resultSet.getInt(0); // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
                String name = resultSet.getString(2); // Correct index
                System.out.println("ID: " + id + ", Name: " + name);
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