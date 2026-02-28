import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement p = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        p.setInt(1, 101); // Renaming 'ps' to 'p'
        ResultSet r = ps.executeQuery(); // Renaming 'rs' to 'r'
        r.next(); // Renaming 'rs.absolute(1)' to 'r.next()'
        System.out.println(r.getString(1)); // Renaming 'rs.getString(0)' to 'r.getString(1)'
        conn.close();
    }
}