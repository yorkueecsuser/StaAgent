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
    
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run because shouldRun is always false.");
    } else {
      System.out.println("This will also never run because shouldRun is always false.");
    }

    stmt.executeQuery("SELECT * FROM table WHERE name = '" + s.next() + "';");
    conn.close();
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}