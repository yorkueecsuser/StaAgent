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

class UnreachableSwitchStatement {
    public static void main(String[] args) {
        boolean condition = getCondition();
        int value = getValue();
        switch(value) {
            case 1:
                if (condition) {
                    System.out.println("Case 1");
                } else {
                    System.out.println("Case 2");
                }
                break;
            case 2:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Case 4");
                break;
        }
    }

    public static boolean getCondition() {
        // Returns a dynamically determined value based on the input arguments
        return false;
    }

    public static int getValue() {
        // Returns a dynamically determined value based on the input arguments
        return 0;
    }
}