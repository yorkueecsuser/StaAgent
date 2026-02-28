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

    // Inserting unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable
        stmt = conn.prepareStatement("UNREACHABLE QUERY");
        break;
      default:
        // Default case will execute
        conn.prepareStatement(query);
        break;
    }

    stmt.setString(1, projectPK);
    return stmt;
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}