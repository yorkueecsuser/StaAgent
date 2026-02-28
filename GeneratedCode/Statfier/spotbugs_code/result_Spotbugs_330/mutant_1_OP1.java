import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Bug1562060 {

  void f4(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = conn.prepareStatement(query);
    preparedStmt.execute();
    // Mutant: Dead Store
    String abcdefgh = "deadstore";
  }

  void f5(Connection conn, String query) throws SQLException {
    Statement stmt = conn.createStatement();
    stmt.execute(query);
    // Mutant: Dead Store
    int ijklmnop = 12345;
  }

  void falseNegative(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = null;
    try {
      preparedStmt = conn.prepareStatement(query);
    } finally {
      if (null!= preparedStmt) {
        try {
          preparedStmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    // Mutant: Dead Store
    boolean opqrstuv = true;
  }

  void f2(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = null;
    try {
      preparedStmt = conn.prepareStatement(query);
    } finally {
      if (preparedStmt!= null) {
        try {
          preparedStmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    // Mutant: Dead Store
    double vwxyzabc = 987.654;
  }

  void f3(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = null;
    try {
      preparedStmt = conn.prepareStatement(query);
    } finally {
      if (preparedStmt == null) {
        try {
          preparedStmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    // Mutant: Dead Store
    char defghijk = 'x';
  }
}