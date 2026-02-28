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
        System.out.println("This will run if shouldRun is true.");
      } else {
        System.out.println("This is an unreachable branch.");
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
    return true; // This ensures the if branch is taken, making the else branch unreachable
  }
}