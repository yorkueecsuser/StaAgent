// Test/sample code for SQL-Java integration using JDBC
// 20 May 2006

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

class SQLvulnerability {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection conn =
        DriverManager.getConnection("jdbc:mysql://localhost/database", "username", "password");
    Statement stmt = conn.createStatement();
    Scanner s = new Scanner(System.in);
    
    // Inserting an unreachable if-else statement
    boolean shouldRun = false; // This variable ensures the if-else block is unreachable
    if (shouldRun) {
      System.out.println("This will never be printed.");
    } else {
      System.out.println("This will also never be printed.");
    }

    stmt.executeQuery("SELECT * FROM table WHERE name = '" + s.next() + "';");
    conn.close();
  }
}