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
      // Some unreachable code
      System.out.println("This is unreachable code in f method.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in f method.");
    }
    return statement.executeQuery(query);
  }

  @NoWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in g method.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in g method.");
    }
    return statement.executeQuery("FOOBAR");
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g2(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in g2 method.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in g2 method.");
    }
    return statement.executeQuery("FOOBAR where x = '" + tableName + "'");
  }

  @ExpectWarning(value = "SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE", confidence = Confidence.HIGH)
  ResultSet h(Connection conn, String name) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in h method with String parameter.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in h method with String parameter.");
    }
    return statement.executeQuery("FOO '" + name + "'");
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in h method with int parameter.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in h method with int parameter.");
    }
    return statement.executeQuery("FOO '" + x + "'");
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h2(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in h2 method.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in h2 method.");
    }
    return statement.executeQuery("FOO '" + Integer.toHexString(x) + "'");
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}