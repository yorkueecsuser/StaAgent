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
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
        case 0:
            // This case is unreachable because condition is never true
            System.out.println("This is an unreachable case.");
            break;
        default:
            // This is the only reachable case
            System.out.println("This is the reachable default case.");
            break;
    }
    
    return stmt;
  }

  private boolean getCondition() {
      // This method always returns false, making the switch condition always evaluate to 1
      return false;
  }
}