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
    return statement.executeQuery(query);

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  @NoWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOOBAR");

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g2(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOOBAR where x = '" + tableName + "'");

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  @ExpectWarning(value = "SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE", confidence = Confidence.HIGH)
  ResultSet h(Connection conn, String name) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOO '" + name + "'");

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOO '" + x + "'");

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h2(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOO '" + Integer.toHexString(x) + "'");

    // Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}