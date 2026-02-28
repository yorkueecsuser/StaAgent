import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.Connection;
import java.sql.PreparedStatement;

class Bug3079260 {
  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION_EXCEPTION_EDGE")
  public PreparedStatement buildGetDataSetStatement(Connection conn) throws Exception {
    PreparedStatement stmt = conn.prepareStatement("select * from blah");
    PreparedStatement stmtCopy = conn.prepareStatement("select * from blah"); // Duplicate assignment
    stmt.execute();
    return stmt;
  }
}