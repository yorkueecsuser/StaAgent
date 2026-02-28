import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        int unusedVar = 42;
        break;
    }
    return rs.getInt(0);
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        int unusedVar = 42;
        break;
    }
    return rs.getInt(i);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        int unusedVar = 42;
        break;
    }
    return i > 0? rs.getInt(i) : CONST;
  }

  private boolean getCondition() {
    // This method returns false, making the switch statement's case 0 unreachable
    return false;
  }
}