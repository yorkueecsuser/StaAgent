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

    // Mutant code
    String a = query;
    PreparedStatement b = null;
    conn.prepareStatement(a);
    b.setString(1, projectPK);
    return b;
  }
}