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
    String jxqkbnrj = "unusedVariable"; // Dead Store
    return statement.executeQuery(query);
  }

  @NoWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    int wvbnrjxz = 42; // Dead Store
    return statement.executeQuery("FOOBAR");
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g2(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    boolean yzqjbnrj = true; // Dead Store
    return statement.executeQuery("FOOBAR where x = '" + tableName + "'");
  }

  @ExpectWarning(value = "SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE", confidence = Confidence.HIGH)
  ResultSet h(Connection conn, String name) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    double pqjbnrjx = 3.14; // Dead Store
    return statement.executeQuery("FOO '" + name + "'");
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    char tjqjbnrj = 'a'; // Dead Store
    return statement.executeQuery("FOO '" + x + "'");
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h2(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    long kxqjbnrj = 100L; // Dead Store
    return statement.executeQuery("FOO '" + Integer.toHexString(x) + "'");
  }
}