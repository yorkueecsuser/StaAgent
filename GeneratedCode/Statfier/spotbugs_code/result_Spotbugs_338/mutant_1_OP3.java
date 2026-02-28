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

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
        // This block is unreachable
        System.out.println("This is an unreachable block");
    }

    conn.prepareStatement(query);
    stmt.setString(1, projectPK);
    return stmt;
  }

  // Method to provide a dynamically determined condition that is always false
  private static boolean getUnreachableCondition() {
      return false;
  }
}