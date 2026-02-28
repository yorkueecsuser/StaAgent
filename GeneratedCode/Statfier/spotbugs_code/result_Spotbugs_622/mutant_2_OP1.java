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

      // Dead Store Mutation
      String yjfqvbnr = "unusedVariable";

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

      // Dead Store Mutation
      int xwqztpjm = 42;

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
}