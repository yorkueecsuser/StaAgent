import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Ideas_2011_11_16 {

  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION_EXCEPTION_EDGE")
  ResultSet doQuery(String query) throws SQLException {
    Connection conn = getConnection();
    Statement statement = conn.createStatement();
    return statement.executeQuery(query);
  }

  @NoWarning("OBL")
  ResultSet doQuery2(Connection conn, String query) throws SQLException {
    Statement statement = conn.createStatement();
    try {
      return statement.executeQuery(query);
    } catch (SQLException e) {
      statement.close();
      throw e;
    }
  }

  ResultSet doQuery3(String query) throws SQLException {
    Connection conn = getConnection();
    Statement statement = conn.createStatement();
    try {
      return statement.executeQuery(query);
    } catch (SQLException e) {
      statement.close();
      throw e;
    }
  }

  @ExpectWarning("OBL")
  int doQuery4(String query) throws SQLException {
    Connection conn = getConnection();
    Statement statement = conn.createStatement();
    try {
      ResultSet rs = statement.executeQuery(query);
      if (rs.next()) return rs.getInt(1);
      return 0;
    } catch (SQLException e) {
      statement.close();
      throw e;
    }
  }

  abstract Connection getConnection();

  // Mutated code with unreachable switch statement
  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }

  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION_EXCEPTION_EDGE")
  ResultSet doQuery(String query) throws SQLException {
    Connection conn = getConnection();
    Statement statement = conn.createStatement();
    boolean condition = getCondition();
    switch (getValue()) {
      case 1:
        if (condition) {
          // Unreachable code
          System.out.println("This is unreachable code.");
        }
        break;
    }
    return statement.executeQuery(query);
  }

  @NoWarning("OBL")
  ResultSet doQuery2(Connection conn, String query) throws SQLException {
    Statement statement = conn.createStatement();
    try {
      boolean condition = getCondition();
      switch (getValue()) {
        case 1:
          if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
          }
          break;
      }
      return statement.executeQuery(query);
    } catch (SQLException e) {
      statement.close();
      throw e;
    }
  }

  ResultSet doQuery3(String query) throws SQLException {
    Connection conn = getConnection();
    Statement statement = conn.createStatement();
    try {
      boolean condition = getCondition();
      switch (getValue()) {
        case 1:
          if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
          }
          break;
      }
      return statement.executeQuery(query);
    } catch (SQLException e) {
      statement.close();
      throw e;
    }
  }

  @ExpectWarning("OBL")
  int doQuery4(String query) throws SQLException {
    Connection conn = getConnection();
    Statement statement = conn.createStatement();
    try {
      boolean condition = getCondition();
      switch (getValue()) {
        case 1:
          if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
          }
          break;
      }
      ResultSet rs = statement.executeQuery(query);
      if (rs.next()) return rs.getInt(1);
      return 0;
    } catch (SQLException e) {
      statement.close();
      throw e;
    }
  }
}