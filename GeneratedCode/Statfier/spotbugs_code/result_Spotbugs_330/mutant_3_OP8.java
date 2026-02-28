import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Bug1562060 {

  void f4(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = conn.prepareStatement(query);
    a.execute();
  }

  void f5(Connection conn, String query) throws SQLException {
    Statement stmt = conn.createStatement();
    stmt.execute(query);
  }

  void falseNegative(Connection conn, String query) throws SQLException {
    PreparedStatement b = null;
    try {

      b = conn.prepareStatement(query);
    } finally {
      if (null!= b) {
        try {
          b.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  void f2(Connection conn, String query) throws SQLException {
    PreparedStatement c = null;
    try {

      c = conn.prepareStatement(query);
    } finally {
      if (c!= null) {
        try {
          c.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  void f3(Connection conn, String query) throws SQLException {
    PreparedStatement d = null;
    try {

      d = conn.prepareStatement(query);
    } finally {
      if (d == null) {
        try {
          d.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }
}