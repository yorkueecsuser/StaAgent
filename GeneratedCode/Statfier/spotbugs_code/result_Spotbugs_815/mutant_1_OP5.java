import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Bug3242908 {
  void getTableStructure(Connection conn, Statement statement, DatabaseMetaData meta)
      throws Exception {
    Statement stmt = null;
    ResultSet select_rs = null;
    ResultSet col = null;
    String s = null;

    try {
      stmt = conn.createStatement();
      select_rs = statement.executeQuery("aa");
      col = meta.getColumns("aa", "aa", "aa", null);
      s = "aaa";

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This is an unreachable case");
          break;
        case 1:
          // This is the reachable case
          System.out.println("This is the reachable case");
          break;
      }
    } catch (SQLException eSchema) {
    }

    try {
      stmt.close();
      select_rs.close();
      col.close();
      s.toCharArray();
    } catch (SQLException e) {
    }
  }

  private boolean getCondition() {
    // This method returns false, making the switch statement's first case unreachable
    return false;
  }
}