import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Bug1562060 {

  void f4(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = conn.prepareStatement(query);
    preparedStmt.execute();
    String abcdefgh = "unusedVariable"; // Dead Store
  }

  void f5(Connection conn, String query) throws SQLException {
    Statement stmt = conn.createStatement();
    stmt.execute(query);
    int ijklmnop = 42; // Dead Store
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
    boolean nopqrstu = true; // Dead Store
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
    double stuvwxyz = 3.14; // Dead Store
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
    char vwxyzabc = 'x'; // Dead Store
  }
}