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
    stmt.executeQuery("SELECT * FROM table WHERE name = '" + s.next() + "';");

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This default case will also never be reached due to the same reason
        System.out.println("This is another unreachable case.");
        break;
    }

    conn.close();
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}