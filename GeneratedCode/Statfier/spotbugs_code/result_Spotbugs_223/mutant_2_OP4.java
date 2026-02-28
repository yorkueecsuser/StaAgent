import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return -1;
    } else {
      // Unreachable code
      return -2;
    }
    return rs.getInt(0);
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return -3;
    } else {
      // Unreachable code
      return -4;
    }
    return rs.getInt(i);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return -5;
    } else {
      // Unreachable code
      return -6;
    }
    return i > 0? rs.getInt(i) : CONST;
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}