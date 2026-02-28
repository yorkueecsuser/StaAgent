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

    conn.prepareStatement(query);
    stmt.setString(1, projectPK);
    return stmt;
  }

  // Mutant code with renaming mutation operator
  public static PreparedStatement lookupAllByProjectPK(String x, Connection y)
      throws SQLException {
    String z =
        " SELECT test_runs.x "
            + " FROM test_runs, projects "
            + " WHERE test_runs.project_jarfile_pk = projects.project_jarfile_pk "
            + " AND projects.project_pk =? ";

    PreparedStatement w = null;

    y.prepareStatement(z);
    w.setString(1, x);
    return w;
  }
}