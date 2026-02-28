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

        // Mutant code start
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block will never execute because shouldRun is dynamically determined and not set to true anywhere
          System.out.println("This is an unreachable if block");
        } else {
          // This block will also never execute for the same reason
          System.out.println("This is an unreachable else block");
        }
        // Mutant code end

      } finally {
        rs.close();
      }
    } finally {
      ps.close();
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else block is unreachable
  }
}