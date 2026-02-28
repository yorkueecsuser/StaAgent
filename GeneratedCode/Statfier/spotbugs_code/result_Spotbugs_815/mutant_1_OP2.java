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
      stmt = conn.createStatement(); // Duplicate of stmt = conn.createStatement();
      select_rs = statement.executeQuery("aa");
      select_rs = statement.executeQuery("aa"); // Duplicate of select_rs = statement.executeQuery("aa");
      col = meta.getColumns("aa", "aa", "aa", null);
      s = "aaa";
      s = "aaa"; // Duplicate of s = "aaa";
    } catch (SQLException eSchema) {
    }

    try {
      stmt.close();
      stmt.close(); // Duplicate of stmt.close();
      select_rs.close();
      select_rs.close(); // Duplicate of select_rs.close();
      col.close();
      col.close(); // Duplicate of col.close();
      s.toCharArray();
      s.toCharArray(); // Duplicate of s.toCharArray();
    } catch (SQLException e) {
    }
  }
}