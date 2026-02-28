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

// Mutant code being added MUST be unique not generic.
// Renaming user-defined variables declared in a program.
// If there exist multiple variables, we randomly select one for the mutation.
// The new name of the variable will be in the form of [a-z].
class BuggyPreparedStatementMutant {
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