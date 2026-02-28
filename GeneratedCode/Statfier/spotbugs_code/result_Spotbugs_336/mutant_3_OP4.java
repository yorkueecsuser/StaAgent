import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Ideas_2011_11_15 {
  public int foo(PreparedStatement stmt) throws Exception {
    ResultSet rs = null;
    try {
      rs = stmt.executeQuery();
      rs.next();
      int x = rs.getInt(1);
      
      // Mutant: Adding an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        x = -1;
      } else {
        // This block should also never execute
        x = -2;
      }
      
      stmt.executeQuery();
      return x;
    } finally {
      if (rs!= null) rs.close();
    }
  }

  public int foo2(PreparedStatement stmt) throws Exception {
    ResultSet rs = null;
    try {
      rs = stmt.executeQuery();
      rs.next();
      int x = rs.getInt(1);
      rs.close();
      stmt.executeQuery();
      rs = stmt.executeQuery();
      rs.next();
      x += rs.getInt(1);
      
      // Mutant: Adding an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        x = -1;
      } else {
        // This block should also never execute
        x = -2;
      }
      
      return x;
    } finally {
      if (rs!= null) rs.close();
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}