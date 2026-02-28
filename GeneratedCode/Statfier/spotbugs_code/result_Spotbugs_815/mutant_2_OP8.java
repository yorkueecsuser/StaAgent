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
    } catch (SQLException eSchema) {
    }

    try {
      stmt.close();
      select_rs.close();
      col.close();
      s.toCharArray();
    } catch (SQLException e) {
    }

    // Mutant code
    Statement z = null;
    ResultSet y = null;
    ResultSet x = null;
    String w = null;

    try {
      z = conn.createStatement();
      y = statement.executeQuery("aa");
      x = meta.getColumns("aa", "aa", "aa", null);
      w = "aaa";
    } catch (SQLException eSchema) {
    }

    try {
      z.close();
      y.close();
      x.close();
      w.toCharArray();
    } catch (SQLException e) {
    }
  }
}