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
    switch (getValue(condition)) {
      case 1:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug2(ResultSet any) throws SQLException {
    any.getInt(0);
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 2:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug3(ResultSet any) throws SQLException {
    any.getLong(0);
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 3:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("SQL_BAD_RESULTSET_ACCESS")
  void bug4(ResultSet any, int anyInt) throws SQLException {
    any.updateInt(0, anyInt);
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 4:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug(ResultSet any) throws SQLException {
    any.setFetchSize(0);
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 5:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug2(ResultSet any) throws SQLException {
    any.setFetchDirection(0);
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 6:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug3(ResultSet any) throws SQLException {
    any.absolute(0);
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 7:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("SQL_BAD_RESULTSET_ACCESS")
  void notBug4(ResultSet any) throws SQLException {
    any.relative(0);
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 8:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }

  private int getValue(boolean condition) {
    return condition? 1 : 0; // This will always return 0, making the switch case unreachable
  }
}