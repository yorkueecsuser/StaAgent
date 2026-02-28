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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
    }
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  abstract Connection getConnection();

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}