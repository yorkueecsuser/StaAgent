import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class DatabaseStreams {

  public static void method() {

    Connection connection = null;
    Statement statement = null;

    try {
      connection = DriverManager.getConnection("blah");
      statement = connection.createStatement();
      // do something with statement

      // Introduced mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will run if shouldRun is true
        System.out.println("This is a reachable block.");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This is an unreachable block.");
      }
    } catch (SQLException e) {
      System.err.println("Error: " + e);
    } finally {
      if (statement!= null) {
        try {
          statement.close();
        } catch (SQLException e) {
          System.err.println("Error closing statement: " + e);
        }
      }
      if (connection!= null) {
        try {
          connection.close();
        } catch (SQLException e) {
          System.err.println("Error closing connection: " + e);
        }
      }
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}