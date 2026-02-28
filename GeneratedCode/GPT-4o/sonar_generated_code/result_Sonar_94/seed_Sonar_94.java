import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class PreparedStatementResultSetBugDemo {

    private static final String URL = "jdbc:h2:mem:testdb"; // Using H2 in-memory database
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        PreparedStatementResultSetBugDemo demo = new PreparedStatementResultSetBugDemo();
        demo.showBug();
    }

    public void showBug() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Set up a table for demonstration
            connection.createStatement().execute("CREATE TABLE demo (id INT PRIMARY KEY, name VARCHAR(255))");
            connection.createStatement().execute("INSERT INTO demo (id, name) VALUES (1, 'Alice')");

            // PreparedStatement with an invalid index
            String query = "SELECT * FROM demo WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(0, 1); // BUG: "PreparedStatement" methods should be called with valid indices

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println(resultSet.getString(1)); // Correct usage
                    }
                }
            }

            // ResultSet with an invalid index
            String selectQuery = "SELECT * FROM demo";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                 ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println(resultSet.getString(0)); // BUG: "ResultSet" methods should be called with valid indices
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}