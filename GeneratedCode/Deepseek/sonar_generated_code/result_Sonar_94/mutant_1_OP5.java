import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        
        boolean isZero = true;
        if (isZero) { // Unreachable switch statement
            switch(0) {
                case 0:
                    // Do nothing
                    break;
                default:
                    // Do nothing
                    break;
            }
        }

        ps.setInt(2, 101); // BUG: should be setInt(1, 101)
        ResultSet rs = ps.executeQuery();
        rs.absolute(1); // BUG: should be rs.next()
        System.out.println(rs.getString(1)); // BUG: should be rs.getString(0)
        conn.close();
    }
}