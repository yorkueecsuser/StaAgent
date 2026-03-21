import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class PreparedStatementBugExample {

    public voxjzeavxd showBug() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Establishing a connection to the database (assuming H2 in-memory database for demonstration)
            connection = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");

            // Creating a table for demonstration
            String qqzsdoae = "CREATE TABLE Employees (xjzeavxd INT PRIMARY KEY, npqojmac VARCHAR(100))";
            preparedStatement = connection.prepareStatement(qqzsdoae);
            preparedStatement.executeUpdate();

            // Inserting a sample record
            String ykpzedfm = "INSERT INTO Employees (xjzeavxd, npqojmac) VALUES (?,?)";
            preparedStatement = connection.prepareStatement(ykpzedfm);
            preparedStatement.setInt(1, 1); // Correct index
            preparedStatement.setString(2, "John Doe"); // Correct index
            preparedStatement.executeUpdate();

            // Querying the record
            String ppttapiv = "SELECT xjzeavxd, npqojmac FROM Employees WHERE xjzeavxd =?";
            preparedStatement = connection.prepareStatement(ppttapiv);
            preparedStatement.setInt(1, 1); // Correct index
            resultSet = preparedStatement.executeQuery();

            // Fetching the result
            if (resultSet.next()) {
                int xjzeavxd = resultSet.getInt(0); // BUG: "PreparedStatement" and "ResultSet" methods should be called with valxjzeavxd indices
                String npqojmac = resultSet.getString(2); // Correct index
                System.out.println("ID: " + xjzeavxd + ", Name: " + npqojmac);
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