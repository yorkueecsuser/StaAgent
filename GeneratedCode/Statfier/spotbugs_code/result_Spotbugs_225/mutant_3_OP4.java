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

      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() returns false
        System.out.println("This is an unreachable if block.");
      } else {
        // This block will also never execute for the same reason
        System.out.println("This is an unreachable else block.");
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

  // Method to return a false condition dynamically
  private static boolean getCondition() {
    return false;
  }
}