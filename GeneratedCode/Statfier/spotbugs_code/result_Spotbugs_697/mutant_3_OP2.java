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
        Integer firstQuestionIdCopy = new Integer(rs.getInt(index++)); // Mutant: duplicated assignment
        String description = rs.getString(index++);
        String descriptionCopy = rs.getString(index++); // Mutant: duplicated assignment
        Float approvalScore = new Float(rs.getFloat(index++));
        Float approvalScoreCopy = new Float(rs.getFloat(index++)); // Mutant: duplicated assignment
      } finally {
        rs.close();
      }
    } finally {
      ps.close();
    }
  }
}