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
    Statement a = null;
    PreparedStatement b = null;
    try {
      a = connection.createStatement();
      a.executeUpdate("CREATE...");

      b = connection.prepareStatement("INSERT...");
      b.executeBatch();

    } finally {
      if (a!= null) a.close();
      if (b!= null) {
        b.close();
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
    Statement c = null;
    PreparedStatement d = null;
    try {
      c = connection.createStatement();
      c.executeUpdate("CREATE...");

      d = connection.prepareStatement("INSERT...");
      d.executeBatch();

    } finally {
      try {
        if (c!= null) c.close();
      } finally {
        if (d!= null) {
          d.close();
        }
      }
    }
  }
}