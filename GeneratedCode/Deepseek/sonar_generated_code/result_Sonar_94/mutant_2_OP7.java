import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        ps.setInt(2, 101); // BUG: should be setInt(1, 101)
        ResultSet rs = ps.executeQuery();
        boolean condition = getCondition();
        while (condition) { // Insert unreachable while loop
            condition = false;
        }
        rs.absolute(1); // BUG: should be rs.next()
        System.out.println(rs.getString(1)); // BUG: should be rs.getString(0)
        conn.close();
    }

    // Helper method to ensure control flow conditions are dynamic
    private boolean getCondition() {
        return false;
    }
}