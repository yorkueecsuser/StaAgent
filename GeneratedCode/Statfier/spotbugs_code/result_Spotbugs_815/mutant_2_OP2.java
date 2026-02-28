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
      stmt = conn.createStatement(); // Mutant: Duplicate of stmt assignment
      select_rs = statement.executeQuery("aa");
      select_rs = statement.executeQuery("aa"); // Mutant: Duplicate of select_rs assignment
      col = meta.getColumns("aa", "aa", "aa", null);
      s = "aaa";
      s = "aaa"; // Mutant: Duplicate of s assignment
    } catch (SQLException eSchema) {
    }

    try {
      stmt.close();
      stmt.close(); // Mutant: Duplicate of stmt.close()
      select_rs.close();
      select_rs.close(); // Mutant: Duplicate of select_rs.close()
      col.close();
      col.close(); // Mutant: Duplicate of col.close()
      s.toCharArray();
      s.toCharArray(); // Mutant: Duplicate of s.toCharArray() - Note: This will still throw an exception if s is null
    } catch (SQLException e) {
    }
  }
}