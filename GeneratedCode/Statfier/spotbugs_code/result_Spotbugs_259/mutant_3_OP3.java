import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Bug3085928 {

  public void relateTagsToRuleset() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    String str = null;
    try {
      conn = DriverManager.getConnection("", "", "");

      str = "select * from EMPLOYEE where ID =? ";
      stmt = conn.prepareStatement(str);
      stmt.setString(1, "");
      rs = stmt.executeQuery();

      // Inserting an unreachable if statement
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        System.out.println("This is an unreachable statement");
      }

    } catch (SQLException se) {
      se.printStackTrace();
    } finally {
      try {
        if (rs!= null) {
          rs.close();
          rs = null;
        }
      } catch (SQLException se) {
        se.printStackTrace();
      }
      try {
        if (stmt!= null) {
          stmt.close();
          stmt = null;
        }
      } catch (SQLException se) {
        se.printStackTrace();
      }
      try {
        if (conn!= null) {
          conn.close();
          conn = null;
        }
      } catch (SQLException se) {
        se.printStackTrace();
      }
    }
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}