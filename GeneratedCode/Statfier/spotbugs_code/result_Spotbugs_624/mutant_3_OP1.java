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
    // Mutant: Dead Store
    String qzjfnxrb = "unusedString";
  }

  @NoWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOOBAR");
    // Mutant: Dead Store
    int vbnrhtyq = 42;
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet g2(Connection conn) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOOBAR where x = '" + tableName + "'");
    // Mutant: Dead Store
    boolean klmnopqr = true;
  }

  @ExpectWarning(value = "SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE", confidence = Confidence.HIGH)
  ResultSet h(Connection conn, String name) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOO '" + name + "'");
    // Mutant: Dead Store
    double wxyzabcd = 3.14;
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOO '" + x + "'");
    // Mutant: Dead Store
    char rstuvwxy = 'a';
  }

  @ExpectWarning("SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE")
  ResultSet h2(Connection conn, int x) throws Exception {
    Statement statement =
        conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return statement.executeQuery("FOO '" + Integer.toHexString(x) + "'");
    // Mutant: Dead Store
    long efghijkl = 123456789L;
  }
}