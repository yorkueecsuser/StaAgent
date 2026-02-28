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

      // Inserting an unreachable if branch
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable because getUnreachableCondition() always returns false
        rowCount = -1; // Some unique code to demonstrate the insertion
      }

      rs.close();
      sqlStatement.close();
      return rowCount;
    } catch (SQLException e) {
      return rowCount;
    }
  }

  // Method to provide a dynamically determined but always false condition
  private static boolean getUnreachableCondition() {
    return false;
  }
}