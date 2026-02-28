import java.sql.*;

class BuggyPreparedStatement {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
                System.out.println(rs.getString(1));
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 1: Duplicate the assignment statement
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
    // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
    System.out.println(rs.getString(1));
}
rs.close();
ps.close();
conn.close();

// Mutant 2: Duplicate the assignment statement
PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
    // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
    System.out.println(rs.getString(1));
}
rs.close();
ps.close();
conn.close();

// Mutant 3: Duplicate the assignment statement
ResultSet rs = ps.executeQuery();
while (rs.next()) {
    // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
    System.out.println(rs.getString(1));
}
rs.close();
ps.close();
conn.close();