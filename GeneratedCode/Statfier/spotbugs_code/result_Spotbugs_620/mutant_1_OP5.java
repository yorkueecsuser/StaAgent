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
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          rowCount = -1; // This line will never execute
          break;
        case 1:
          // This is the only reachable case
          break;
      }
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }
}