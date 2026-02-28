import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Bug1562060 {

  void f4(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = conn.prepareStatement(query);
    x.execute(); // Mutant: Renamed 'preparedStmt' to 'x'
  }

  void f5(Connection conn, String query) throws SQLException {
    Statement stmt = conn.createStatement();
    y.execute(query); // Mutant: Renamed'stmt' to 'y'
  }

  void falseNegative(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = null;
    try {
      a = conn.prepareStatement(query); // Mutant: Renamed 'preparedStmt' to 'a'
    } finally {
      if (null!= a) { // Mutant: Renamed 'preparedStmt' to 'a'
        try {
          a.close(); // Mutant: Renamed 'preparedStmt' to 'a'
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  void f2(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = null;
    try {
      b = conn.prepareStatement(query); // Mutant: Renamed 'preparedStmt' to 'b'
    } finally {
      if (b!= null) { // Mutant: Renamed 'preparedStmt' to 'b'
        try {
          b.close(); // Mutant: Renamed 'preparedStmt' to 'b'
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  void f3(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = null;
    try {
      c = conn.prepareStatement(query); // Mutant: Renamed 'preparedStmt' to 'c'
    } finally {
      if (c == null) { // Mutant: Renamed 'preparedStmt' to 'c'
        try {
          c.close(); // Mutant: Renamed 'preparedStmt' to 'c'
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }
}