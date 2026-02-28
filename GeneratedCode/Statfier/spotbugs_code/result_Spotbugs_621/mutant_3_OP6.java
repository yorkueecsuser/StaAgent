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
    
    // Introduced unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getConditionForLoop() always returns false
    }
    
    return stmt;
  }

  private boolean getConditionForLoop() {
    // This method always returns false, ensuring the for loop is unreachable
    return false;
  }
}