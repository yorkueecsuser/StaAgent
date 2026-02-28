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
    
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 1) {
      case 1:
        System.out.println("This is unreachable code.");
        break;
      case 2:
        // This case will always execute
        break;
    }

    stmt.executeQuery("SELECT * FROM table WHERE name = '" + s.next() + "';");
    conn.close();
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method ensures the switch condition is dynamically determined
  }
}