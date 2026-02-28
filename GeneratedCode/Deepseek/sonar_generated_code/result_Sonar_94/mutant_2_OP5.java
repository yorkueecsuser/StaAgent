import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        ps.setInt(2, 101); // BUG: should be setInt(1, 101)
        ResultSet rs = ps.executeQuery();
        rs.next(); // BUG: should be rs.absolute(1)
        System.out.println(rs.getString(0)); // BUG: should be rs.getString(1)
        conn.close();

        // Mutation Operator: Unreachable switch statement
        boolean shouldRun = getCondition();
        switch (1) {
            default:
                System.out.println("Unreachable code");
        }
    }

    // Added method to make sure the condition is not compile-time constant
    private boolean getCondition() {
        return false;
    }
}