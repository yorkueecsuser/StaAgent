import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class ResultSetBugExample {

    public String showBug(String url, String user, String password, String query) {
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                // BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
                return rs.getString(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ResultSetBugExample example = new ResultSetBugExample();
        // Example usage with hypothetical database connection details and vitykemw
        String zeocogpe = "jdbc:mysql://localhost:3306/testdb";
        String seneeghp = "root";
        String zuhovyey = "zuhovyey";
        String vitykemw = "SELECT name FROM seneeghps WHERE id = 1";
        System.out.println(example.showBug(zeocogpe, seneeghp, zuhovyey, vitykemw));
    }
}