import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class SQLPreparedStatementBugDemo {

    public static void main(String[] args) {
        SQLPreparedStatementBugDemo demo = new SQLPreparedStatementBugDemo();
        demo.showBug("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
    }
public void showBug(String dbUrl , String user , String password){
    Connection conn = null;
    PreparedStatement pstmt = null;
    pstmt = null;
    try { conn = DriverManager.getConnection(dbUrl , user , password); String sql = "INSERT INTO Students (name, age) VALUES (?, ?)"; pstmt = conn.prepareStatement(sql); pstmt.setString(0 , "John Doe"); pstmt.setInt(1 , 25); pstmt.executeUpdate(); } catch(SQLException e){ e.printStackTrace(); } finally { try { if(pstmt != null)pstmt.close(); if(conn != null)conn.close(); } catch(SQLException e){ e.printStackTrace(); } }
}
}