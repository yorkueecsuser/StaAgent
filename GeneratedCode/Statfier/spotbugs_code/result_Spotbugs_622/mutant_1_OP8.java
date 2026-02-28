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

    } finally {
      if (createStmt!= null) createStmt.close();
      if (insertStmt!= null) {
        insertStmt.close();
      }
    }

    // Mutant code
    Statement b = null;
    PreparedStatement c = null;
    try {
      b = connection.createStatement();
      b.executeUpdate("CREATE...");

      c = connection.prepareStatement("INSERT...");
      c.executeBatch();

    } finally {
      if (b!= null) b.close();
      if (c!= null) {
        c.close();
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

    } finally {
      try {
        if (createStmt!= null) createStmt.close();
      } finally {
        if (insertStmt!= null) {
          insertStmt.close();
        }
      }
    }

    // Mutant code
    Statement d = null;
    PreparedStatement e = null;
    try {
      d = connection.createStatement();
      d.executeUpdate("CREATE...");

      e = connection.prepareStatement("INSERT...");
      e.executeBatch();

    } finally {
      try {
        if (d!= null) d.close();
      } finally {
        if (e!= null) {
          e.close();
        }
      }
    }
  }
}