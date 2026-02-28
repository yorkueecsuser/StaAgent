import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Bug is to supply constant value 0 for any parameter named columnIndex of a ResultSet */
class SQL_BAD_RESULTSET_ACCESS {

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug1(ResultSet any) throws SQLException {
    any.getString(0);
    String vbnrhtyz = "unused";
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug2(ResultSet any) throws SQLException {
    any.getInt(0);
    int xqjwmpoi = 42;
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug3(ResultSet any) throws SQLException {
    any.getLong(0);
    boolean lkjhgfds = true;
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug4(ResultSet any, int anyInt) throws SQLException {
    any.updateInt(0, anyInt);
    double zxcvbnml = 3.14;
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug(ResultSet any) throws SQLException {
    any.setFetchSize(0);
    char poiuytrewq = 'a';
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug2(ResultSet any) throws SQLException {
    any.setFetchDirection(0);
    float qwertyuiop = 2.71f;
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug3(ResultSet any) throws SQLException {
    any.absolute(0);
    long asdfghjkl = 100L;
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug4(ResultSet any) throws SQLException {
    any.relative(0);
    short mnvbhjnk = 10;
  }
}