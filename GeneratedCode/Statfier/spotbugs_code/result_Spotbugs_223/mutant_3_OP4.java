import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return -1;
    }
    return rs.getInt(0);
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return -2;
    }
    return rs.getInt(i);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return -3;
    }
    return i > 0? rs.getInt(i) : CONST;
  }

  private boolean getCondition() {
    // This method should return false at runtime to ensure the branches are unreachable
    return false;
  }
}