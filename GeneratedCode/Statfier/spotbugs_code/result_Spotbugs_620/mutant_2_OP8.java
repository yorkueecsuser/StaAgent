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

    // Mutated code
    String a;
    Statement b;
    ResultSet c;
    int d = 0;

    try {
      b = dbConnection.createStatement();
      a = "SELECT COUNT(*) FROM " + tableName;
      // System.out.println(a);

      c = b.executeQuery(a);
      c.next();
      d = c.getInt(1);

      c.close();
      b.close();
      return d;
    } catch (SQLException f) {
      return d;
    }
  }
}