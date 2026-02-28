import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Bug1562060 {

  void f4(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = conn.prepareStatement(query);
    preparedStmt.execute();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  void f5(Connection conn, String query) throws SQLException {
    Statement stmt = conn.createStatement();
    stmt.execute(query);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block.");
    }
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block.");
    }
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block.");
    }
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }
}