import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class IgnoredReturnValueOfSqlConnection {
  public static PreparedStatement lookupAllByProjectPK(String projectPK, Connection conn)
      throws SQLException {
    String query =
        " SELECT test_runs.x "
            + " FROM test_runs, projects "
            + " WHERE test_runs.project_jarfile_pk = projects.project_jarfile_pk "
            + " AND projects.project_pk =? ";

    PreparedStatement stmt = null;

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
        // This block will never execute because shouldRun is always false
        stmt = conn.prepareStatement(query);
        stmt.setString(1, projectPK);
    } else {
        // This block will always execute
        conn.prepareStatement(query);
        stmt.setString(1, projectPK);
    }

    return stmt;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
      return false;
  }
}