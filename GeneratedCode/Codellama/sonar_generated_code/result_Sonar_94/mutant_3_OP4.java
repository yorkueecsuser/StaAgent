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

        // Unreachable if-else statement mutation
        if (getCondition()) {
            // Code to be executed when the condition is true
            System.out.println("Condition is true");
        } else {
            // Code to be executed when the condition is false
            System.out.println("Condition is false");
        }
    }

    // Method to retrieve the condition for the if-else statement
    private static boolean getCondition() {
        // This method always returns false, making the else branch unreachable
        return false;
    }
}