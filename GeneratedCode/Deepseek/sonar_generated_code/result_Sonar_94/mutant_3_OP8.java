import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        ps.setInt(1, 101); // Mutation: renamed variable 'ps' to 'pq'
        ResultSet rs = ps.executeQuery();
        rs.next(); // Mutation: changed method 'rs.next()' to 'rs.absolute(1)'
        System.out.println(rs.getString(1)); // Mutation: changed 'rs.getString(0)' to 'rs.getString(1)'
        conn.close();
    }
}