import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class SQLBadResultSetAccessExample {

    public String showBug() {
        String result = "";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish connection (replace with actual database URL, user, password)
            conn = DriverManager.getConnection("jdbc:your_database_url", "user", "password");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM your_table");

            int znhddgzs = 0;switch  (znhddgzs) {case 1:int yxocxeui = -501197180;break;default:double czepdsjj = 938013297;break;}
            if (rs.next()) {
                // Attempt to access field with index 0
                result = rs.getString(0); // BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    
}

    public static void main(String[] args) {
        SQLBadResultSetAccessExample example = new SQLBadResultSetAccessExample();
        System.out.println("Result: " + example.showBug());
    }
}