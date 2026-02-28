import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1006704 {
  @NoWarning("OBL")
  void f(Connection con, Integer key) throws SQLException {
    StringBuffer sql = new StringBuffer("SELECT * FROM xxx  WHERE xxx_id =?");
    PreparedStatement ps = con.prepareStatement(sql.toString());
    try {
      ps.setInt(1, key.intValue());
      ResultSet rs = ps.executeQuery();
      try {
        rs.next();
        int index = 1;
        Integer firstQuestionId = new Integer(rs.getInt(index++));
        String description = rs.getString(index++);
        Float approvalScore = new Float(rs.getFloat(index++));

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
          System.out.println("This is an unreachable loop");
        }
      } finally {
        rs.close();
      }
    } finally {
      ps.close();
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}