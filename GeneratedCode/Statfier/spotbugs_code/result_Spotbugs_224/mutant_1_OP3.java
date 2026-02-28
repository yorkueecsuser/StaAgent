import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Bug is to supply constant value 0 for any parameter named columnIndex of a ResultSet */
class SQL_BAD_RESULTSET_ACCESS {

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug1(ResultSet any) throws SQLException {
    any.getString(0);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in bug1");
    }
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug2(ResultSet any) throws SQLException {
    any.getInt(0);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in bug2");
    }
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug3(ResultSet any) throws SQLException {
    any.getLong(0);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in bug3");
    }
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug4(ResultSet any, int anyInt) throws SQLException {
    any.updateInt(0, anyInt);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in bug4");
    }
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug(ResultSet any) throws SQLException {
    any.setFetchSize(0);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in notBug");
    }
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug2(ResultSet any) throws SQLException {
    any.setFetchDirection(0);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in notBug2");
    }
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug3(ResultSet any) throws SQLException {
    any.absolute(0);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in notBug3");
    }
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug4(ResultSet any) throws SQLException {
    any.relative(0);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block in notBug4");
    }
  }

  private boolean getCondition() {
    return false;
  }
}