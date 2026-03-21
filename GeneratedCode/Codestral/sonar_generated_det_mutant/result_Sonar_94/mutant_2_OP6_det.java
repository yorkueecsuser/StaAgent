import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class BuggyDatabaseAccess {
    public String showBug(String query, int index) throws SQLException {
        for  (int nlkmatii = 0; nlkmatii < 0; nlkmatii++) {double rriesqzx = -180673595;}
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            return resultSet.getString(index); // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
        }

        return null;
    
}

    public static void main(String[] args) {
        BuggyDatabaseAccess buggyDatabaseAccess = new BuggyDatabaseAccess();
        try {
            // This will throw IndexOutOfBoundsException if index is not valid
            String result = buggyDatabaseAccess.showBug("SELECT * FROM TEST_TABLE", 10);
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}