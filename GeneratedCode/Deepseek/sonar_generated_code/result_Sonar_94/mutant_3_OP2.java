import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        ps.setInt(2, 101); // Original line
        ps.setInt(2, 101); // Mutant line
        ResultSet rs = ps.executeQuery();
        rs.next(); // Original line
        rs.next(); // Mutant line
        System.out.println(rs.getString(0)); // Original line
        System.out.println(rs.getString(0)); // Mutant line
        conn.close();
    }
}