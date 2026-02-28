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

    // Unreachable switch statement mutant
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

        // Unreachable switch statement
        int condition = getCondition();
        switch (condition) {
            case 1:
                System.out.println("Reachable case");
                break;
            case 2:
                System.out.println("Unreachable case");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    // Method to generate a non-final variable condition
    public static int getCondition() {
        return 1;
    }
}