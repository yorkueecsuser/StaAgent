import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in getInt0");
    }
    return rs.getInt(0);
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in getInt");
    }
    return rs.getInt(i);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in getIntCheck");
    }
    return i > 0? rs.getInt(i) : CONST;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}