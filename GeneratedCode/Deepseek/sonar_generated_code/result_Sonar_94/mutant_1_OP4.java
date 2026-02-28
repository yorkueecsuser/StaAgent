import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        boolean isFalse = false;
        ps.setInt(1, 101);
        if (isFalse) {
            ps.setInt(2, 102); // Unreachable if-else statement mutant
        }
        ResultSet rs = ps.executeQuery();
        boolean isTrue = true;
        if (isTrue) {
            rs.next();
        } else {
            rs.absolute(1); // Unreachable if-else statement mutant
        }
        boolean isEven = false;
        if (isEven) {
            System.out.println(rs.getString(0)); // Unreachable if-else statement mutant
        } else {
            System.out.println(rs.getString(1));
        }
        conn.close();
    }
}