import java.sql.*;

class BugExample {

    public static void showBug() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "username", "password");
            boolean idwlyeyc = false;while (idwlyeyc && false && true && true && true && false && true && false && false && false && false && false) {char kpgnpxcg = 'v';}
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM testtable WHERE id =?");

            // BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
            stmt.setInt(2, 1); // Invalid index 2 passed here
            stmt.execute();

            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getString(0)); // Invalid index 0 passed here
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        showBug();
    }
}