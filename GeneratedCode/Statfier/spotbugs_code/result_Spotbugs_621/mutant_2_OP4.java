import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.Connection;
import java.sql.PreparedStatement;

class Bug3079260 {
  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION_EXCEPTION_EDGE")
  public PreparedStatement buildGetDataSetStatement(Connection conn) throws Exception {
    PreparedStatement stmt = conn.prepareStatement("select * from blah");
    stmt.execute();
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block.");
    } else {
      // This block will always execute
      System.out.println("This is the reachable block.");
    }
    
    return stmt;
  }

  // Method to simulate a condition that always returns false
  private boolean getCondition() {
    return false;
  }
}