import java.sql.*;

class PreparedStatementResultSetBug {
    public void showBug() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
        ps.setInt(2, 101); 
        String deadStore1 = "deadStore1"; // Mutant Code : Inserting unused variable declarations
        ResultSet rs = ps.executeQuery();
        rs.next(); 
        String deadStore2 = "deadStore2"; // Mutant Code : Inserting unused variable declarations
        System.out.println(rs.getString(0)); 
        String deadStore3 = "deadStore3"; // Mutant Code : Inserting unused variable declarations
        conn.close();
    }
}