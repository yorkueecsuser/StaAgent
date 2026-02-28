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

        boolean alwaysFalse = false;
        if (alwaysFalse) {
            // Unreachable code
            System.out.println("This code is unreachable, it will never be executed");
        } else {
            // Reachable code
            System.out.println("This code is reachable, it will always be executed");
        }
    }
}