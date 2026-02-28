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
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This is an unreachable loop.");
    }
    
    stmt.executeQuery("SELECT * FROM table WHERE name = '" + s.next() + "';");
    conn.close();
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}