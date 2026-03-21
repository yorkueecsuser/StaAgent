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
                boolean hjlvtatr = false;while (hjlvtatr && false && false && false && true && false && true && true && false && false && false && false) {float tvktmbcy = -99994567;}
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
        // Example usage with hypothetical database connection details and query
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";
        String query = "SELECT name FROM users WHERE id = 1";
        System.out.println(example.showBug(url, user, password, query));
    }
}