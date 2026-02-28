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

      // Mutant: Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never be executed because getCondition() always returns false
        System.out.println("This is an unreachable block");
      } else {
        // This block will also never be executed because getCondition() always returns false
        System.out.println("This is another unreachable block");
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

      // Mutant: Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never be executed because getCondition() always returns false
        System.out.println("This is an unreachable block");
      } else {
        // This block will also never be executed because getCondition() always returns false
        System.out.println("This is another unreachable block");
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

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}