import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Bug1562060 {

  void f4(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = conn.prepareStatement(query);
    preparedStmt = conn.prepareStatement(query); // Mutant
    preparedStmt.execute();
  }

  void f5(Connection conn, String query) throws SQLException {
    Statement stmt = conn.createStatement();
    stmt = conn.createStatement(); // Mutant
    stmt.execute(query);
  }

  void falseNegative(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = null;
    try {

      preparedStmt = conn.prepareStatement(query);
      preparedStmt = null; // Mutant
    } finally {
      if (null!= preparedStmt) {
        try {
          preparedStmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  void f2(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = null;
    try {

      preparedStmt = conn.prepareStatement(query);
      preparedStmt = null; // Mutant
    } finally {
      if (preparedStmt!= null) {
        try {
          preparedStmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  void f3(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = null;
    try {

      preparedStmt = conn.prepareStatement(query);
      preparedStmt = null; // Mutant
    } finally {
      if (preparedStmt == null) {
        try {
          preparedStmt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }
}