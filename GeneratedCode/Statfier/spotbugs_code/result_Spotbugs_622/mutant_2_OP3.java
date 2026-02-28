import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Bug3152881 {
  void asProvided(Connection connection) throws SQLException {
    Statement createStmt = null;
    PreparedStatement insertStmt = null;
    try {
      createStmt = connection.createStatement();
      createStmt.executeUpdate("CREATE...");

      insertStmt = connection.prepareStatement("INSERT...");
      insertStmt.executeBatch();

      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      }

    } finally {
      if (createStmt!= null) createStmt.close();
      if (insertStmt!= null) {
        insertStmt.close();
      }
    }
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  void falsePositive2(Connection connection) throws SQLException {
    Statement createStmt = null;
    PreparedStatement insertStmt = null;
    try {
      createStmt = connection.createStatement();
      createStmt.executeUpdate("CREATE...");

      insertStmt = connection.prepareStatement("INSERT...");
      insertStmt.executeBatch();

      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      }

    } finally {
      try {
        if (createStmt!= null) createStmt.close();
      } finally {
        if (insertStmt!= null) {
          insertStmt.close();
        }
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}