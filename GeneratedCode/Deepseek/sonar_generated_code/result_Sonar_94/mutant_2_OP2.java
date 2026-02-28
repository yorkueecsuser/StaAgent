import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        ps.setInt(2, 101); // BUG: should be setInt(1, 101)
        
        // Duplication mutation operator - Duplicate the original assignment statement
        ps.setInt(2, 101);

        ResultSet rs = ps.executeQuery();
        rs.next(); // BUG: should be rs.absolute(1)
        
        // Duplication mutation operator - Duplicate the original assignment statement
        rs.next();

        System.out.println(rs.getString(0)); // BUG: should be rs.getString(1)
        
        // Duplication mutation operator - Duplicate the original assignment statement
        System.out.println(rs.getString(0));

        conn.close();
    }
}