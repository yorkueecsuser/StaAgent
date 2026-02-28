import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class SqlInjection {

  static final String tableName = System.getProperty("XXX");

  @NoWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet f(Connection conn, String query) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in f method.");
    }
    return statement.executeQuery(query);
  }

  @NoWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in g method.");
    }
    return statement.executeQuery("FOOBAR");
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g2(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in g2 method.");
    }
    return statement.executeQuery("FOOBAR where x = '" + tableName + "'");
  }

  @ExpectWarning(value = "SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE", confidence = Confidence.HIGH)
  ResultSet h(Connection conn, String name) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in h method.");
    }
    return statement.executeQuery("FOO '" + name + "'");
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in h method with int parameter.");
    }
    return statement.executeQuery("FOO '" + x + "'");
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h2(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in h2 method.");
    }
    return statement.executeQuery("FOO '" + Integer.toHexString(x) + "'");
  }

  private boolean getCondition() {
    return false; // This method can be modified to return true for testing purposes, but it should be false for unreachable code.
  }
}