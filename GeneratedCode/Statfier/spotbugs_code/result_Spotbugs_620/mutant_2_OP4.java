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
      // Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        rowCount = -1;
      } else {
        // This block also should never execute
        rowCount = -2;
      }
      return rowCount;
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}