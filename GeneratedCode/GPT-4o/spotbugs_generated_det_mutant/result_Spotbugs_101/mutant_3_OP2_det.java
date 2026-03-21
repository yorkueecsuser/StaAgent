import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class SQLBadResultSetAccessExample {
public String showBug() {
    String result = "";
    Connection conn = null;
    Statement stmt = null;
    stmt = null;
    ResultSet rs = null;
    try { conn = DriverManager.getConnection("jdbc:your_database_url" , "user" , "password"); stmt = conn.createStatement(); rs = stmt.executeQuery("SELECT * FROM your_table"); if(rs.next()){ result = rs.getString(0); } } catch(SQLException e){ e.printStackTrace(); } finally { try { if(rs != null)rs.close(); if(stmt != null)stmt.close(); if(conn != null)conn.close(); } catch(SQLException e){ e.printStackTrace(); } }
    return result;
}

    public static void main(String[] args) {
        SQLBadResultSetAccessExample example = new SQLBadResultSetAccessExample();
        System.out.println("Result: " + example.showBug());
    }
}