import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return rs.getInt(0);
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return rs.getInt(i);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return i > 0? rs.getInt(i) : CONST;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}