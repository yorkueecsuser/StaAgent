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

// Mutant 1: Renaming variable "rs" to "resultSet"
class BuggyPreparedStatement {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id =?");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
                System.out.println(resultSet.getString(1));
            }
            resultSet.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// Mutant 2: Renaming variable "ps" to "preparedStatement"
class BuggyPreparedStatement {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM users WHERE id =?");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
                System.out.println(rs.getString(1));
            }
            rs.close();
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}