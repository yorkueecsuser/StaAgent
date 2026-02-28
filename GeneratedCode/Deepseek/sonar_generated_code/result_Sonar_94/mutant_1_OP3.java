import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        
        // Mutation: Adding unreachable if branch
        boolean condition = false;
        if (!condition) {
            ps.setInt(1, 101); 
            ResultSet rs = ps.executeQuery();
            rs.next(); 
            System.out.println(rs.getString(1));
        }
        
        conn.close();
    }
}