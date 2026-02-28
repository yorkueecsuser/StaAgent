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
      connection = null; // Mutant: Duplicate assignment without method invocation
      statement = connection.createStatement();
      statement = connection.createStatement(); // Mutant: Duplicate assignment without method invocation
      // do something with statement
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
}