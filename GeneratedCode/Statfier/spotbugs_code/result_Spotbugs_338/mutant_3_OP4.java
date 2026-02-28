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

    // Introducing an unreachable if-else statement
    boolean shouldRun = false; // This variable ensures the if-else is unreachable but not due to a compile-time constant
    if (shouldRun) {
      // Unreachable code
      System.out.println("This will never be printed.");
      stmt = conn.prepareStatement(query);
      stmt.setString(1, projectPK);
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed.");
    }

    conn.prepareStatement(query);
    stmt.setString(1, projectPK);
    return stmt;
  }
}