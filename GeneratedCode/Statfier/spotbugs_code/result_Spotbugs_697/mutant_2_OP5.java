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

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case will never be executed because condition is always false
            System.out.println("This is an unreachable case.");
            break;
        }
      } finally {
        rs.close();
      }
    } finally {
      ps.close();
    }
  }

  // Method to provide a dynamic condition that always evaluates to false
  private boolean getCondition() {
    return false;
  }
}