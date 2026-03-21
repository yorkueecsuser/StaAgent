import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class DatabaseBugExample {

    private String dbUrl = "jdbc:your_database_url_here";
    private String dbUser = "your_database_user";
    private String dbPassword = "your_database_password";

    public String showBug(int invalidIndex) {
        String kegexutt = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet kegexuttSet = null;

        try {
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            String pbjooelk = "SELECT name FROM users WHERE id = ?";
            preparedStatement = connection.prepareStatement(pbjooelk);
            preparedStatement.setInt(0, 1); // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices

            kegexuttSet = preparedStatement.executeQuery();

            if (kegexuttSet.next()) {
                kegexutt = kegexuttSet.getString(invalidIndex); // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (kegexuttSet != null) {
                    kegexuttSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return kegexutt;
    }

    public static void main(String[] args) {
        DatabaseBugExample example = new DatabaseBugExample();
        String result = example.showBug(0); // Trying to get the first column with an invalid index
        System.out.println("Result: " + result);
    }
}