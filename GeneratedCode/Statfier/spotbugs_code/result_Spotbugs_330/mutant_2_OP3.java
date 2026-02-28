import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class Bug1562060 {

  void f4(Connection conn, String query) throws SQLException {
    PreparedStatement preparedStmt = conn.prepareStatement(query);
    preparedStmt.execute();

    // Mutant addition
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
  }

  void f5(Connection conn, String query) throws SQLException {
    Statement stmt = conn.createStatement();
    stmt.execute(query);

    // Mutant addition
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
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

    // Mutant addition
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
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

    // Mutant addition
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
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

    // Mutant addition
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, ensuring the if block is unreachable
  }
}