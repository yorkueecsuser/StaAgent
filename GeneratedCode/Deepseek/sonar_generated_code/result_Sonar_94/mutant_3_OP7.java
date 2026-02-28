import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        boolean shouldUse101 = true;
        ps.setInt(shouldUse101? 1 : 0, 101); // Mutated BUG: should be setInt(1, 101)
        ResultSet rs = ps.executeQuery();
        boolean shouldMoveToNext = true;
        while (shouldMoveToNext) { // Mutated BUG: should be rs.absolute(1)
            if (rs.next()) {
                break;
            }
        }
        System.out.println(rs.getString(0)); // Mutated BUG: should be rs.getString(1)
        conn.close();
    }
}