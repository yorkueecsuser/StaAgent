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
    }

    // Inserting an unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      rowCount = -1; // This line is unreachable
    }
  }

  private static boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}