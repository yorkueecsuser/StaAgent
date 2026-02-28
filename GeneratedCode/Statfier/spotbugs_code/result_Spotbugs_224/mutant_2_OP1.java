import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Bug is to supply constant value 0 for any parameter named columnIndex of a ResultSet */
class SQL_BAD_RESULTSET_ACCESS {

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug1(ResultSet any) throws SQLException {
    any.getString(0);
    String qwejrtyp = "unused"; // Dead store
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug2(ResultSet any) throws SQLException {
    any.getInt(0);
    int kjhgfdsa = 42; // Dead store
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug3(ResultSet any) throws SQLException {
    any.getLong(0);
    boolean zxcvbnml = true; // Dead store
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug4(ResultSet any, int anyInt) throws SQLException {
    any.updateInt(0, anyInt);
    double asdfghjk = 3.14; // Dead store
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug(ResultSet any) throws SQLException {
    any.setFetchSize(0);
    char poiuytrew = 'a'; // Dead store
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug2(ResultSet any) throws SQLException {
    any.setFetchDirection(0);
    float lkjhgfds = 2.71f; // Dead store
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug3(ResultSet any) throws SQLException {
    any.absolute(0);
    long mnbvcxz = 123456789L; // Dead store
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug4(ResultSet any) throws SQLException {
    any.relative(0);
    short qwertyui = 123; // Dead store
  }
}