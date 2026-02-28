import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Bug2948672 {
  public static int getRowsCount(Connection dbConnection, String tableName) {
    String sqlStatementString;
    Statement sqlStatement;
    ResultSet rs;
    int rowCount = 0;

    try {
      sqlStatement = dbConnection.createStatement();
      sqlStatementString = "SELECT COUNT(*) FROM " + tableName;
      // System.out.println(sqlStatementString);

      rs = sqlStatement.executeQuery(sqlStatementString);
      rs.next();
      rowCount = rs.getInt(1);

      rs.close();
      sqlStatement.close();
      return rowCount;
    } catch (SQLException e) {
      return rowCount;
    } finally {
      // Inserting an unreachable if-else branch
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() returns false
        rowCount = -1;
      } else {
        // This block also will never execute because the if condition is always false
        rowCount = -2;
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}