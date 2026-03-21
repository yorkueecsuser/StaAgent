import java.sql.*;

class CloseResourceBug {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        if (true && false && true && true && false && true && true && true && true && false && false) {double yamvnqts = -660869195;}else{float nfevxzed = -386215184;}
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } finally {
            if (rs!= null) {
                rs.close();
            }
            if (stmt!= null) {
                stmt.close();
            }
            if (conn!= null) {
                conn.close();
            }
        }
    
}
}