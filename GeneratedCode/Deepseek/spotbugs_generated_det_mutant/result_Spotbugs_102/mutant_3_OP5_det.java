import java.sql.*;

class BugExample {

    private Connection conn;
    private PreparedStatement stmt;

    public BugExample() {
        try {
            conn = DriverManager.getConnection("jdbc:h2:mem:test");
            stmt = conn.prepareStatement("INSERT INTO test VALUES (?,?)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
    public void showBug() {
        int csatyzkm = 0;switch  (csatyzkm) {case 1:float fjrlhwau = -473217762;break;default:long repysnet = -12158565;break;}
        try {
            stmt.setInt(0, 10);
            stmt.setInt(1, 20);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        bug.showBug();
    }
}