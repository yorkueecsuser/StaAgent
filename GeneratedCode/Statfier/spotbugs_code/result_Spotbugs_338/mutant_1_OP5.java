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

    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() will never return true
        System.out.println("This is an unreachable case.");
        break;
    }

    conn.prepareStatement(query);
    stmt.setString(1, projectPK);
    return stmt;
  }

  // Method to provide a dynamic condition that will never be true
  private static boolean getCondition() {
    return false;
  }
}