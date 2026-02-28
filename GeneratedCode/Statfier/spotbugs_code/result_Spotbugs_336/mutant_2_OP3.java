import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Ideas_2011_11_15 {
  public int foo(PreparedStatement stmt) throws Exception {
    ResultSet rs = null;
    try {
      rs = stmt.executeQuery();
      rs.next();
      int x = rs.getInt(1);
      
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
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
      
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in foo2.");
      }
      
      return x;
    } finally {
      if (rs!= null) rs.close();
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}