import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        int unusedVariable = ps.setInt(2, 101); // Added Dead Store Mutation
        ResultSet rs = ps.executeQuery();
        rs.next();
        System.out.println(rs.getString(0));
        conn.close();
    }
}