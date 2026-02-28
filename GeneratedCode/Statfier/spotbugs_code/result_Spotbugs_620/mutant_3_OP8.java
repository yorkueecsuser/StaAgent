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
    String b;
    Statement c;
    ResultSet d;
    int e = 0;

    try {
      c = dbConnection.createStatement();
      b = "SELECT COUNT(*) FROM " + tableName;
      // System.out.println(b);

      d = c.executeQuery(b);
      d.next();
      e = d.getInt(1);

      d.close();
      c.close();
      return e;
    } catch (SQLException f) {
      return e;
    }
  }
}