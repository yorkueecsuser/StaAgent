import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Bug is to supply constant value 0 for any parameter named columnIndex of a ResultSet */
class SQL_BAD_RESULTSET_ACCESS {

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug1(ResultSet any) throws SQLException {
    any.getString(0);
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug2(ResultSet any) throws SQLException {
    any.getInt(0);
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug3(ResultSet any) throws SQLException {
    any.getLong(0);
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug4(ResultSet any, int anyInt) throws SQLException {
    any.updateInt(0, anyInt);
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug(ResultSet rs) throws SQLException {
    rs.setFetchSize(0);
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug2(ResultSet rs) throws SQLException {
    rs.setFetchDirection(0);
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug3(ResultSet rs) throws SQLException {
    rs.absolute(0);
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug4(ResultSet rs) throws SQLException {
    rs.relative(0);
  }

  // Mutated methods with renamed variables
  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug1Mutant(ResultSet x) throws SQLException {
    x.getString(0);
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug2Mutant(ResultSet y) throws SQLException {
    y.getInt(0);
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug3Mutant(ResultSet z) throws SQLException {
    z.getLong(0);
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug4Mutant(ResultSet w, int v) throws SQLException {
    w.updateInt(0, v);
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBugMutant(ResultSet q) throws SQLException {
    q.setFetchSize(0);
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug2Mutant(ResultSet p) throws SQLException {
    p.setFetchDirection(0);
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug3Mutant(ResultSet o) throws SQLException {
    o.absolute(0);
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug4Mutant(ResultSet n) throws SQLException {
    n.relative(0);
  }
}