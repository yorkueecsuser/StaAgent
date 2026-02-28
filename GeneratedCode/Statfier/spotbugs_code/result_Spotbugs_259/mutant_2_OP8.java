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

    // Mutated code
    Connection conx = null;
    PreparedStatement stmx = null;
    ResultSet rsx = null;
    String strx = null;
    try {
      conx = DriverManager.getConnection("", "", "");

      strx = "select * from EMPLOYEE where ID =? ";
      stmx = conx.prepareStatement(strx);
      stmx.setString(1, "");
      rsx = stmx.executeQuery();

    } catch (SQLException sex) {
      sex.printStackTrace();
    } finally {
      try {
        if (rsx!= null) {
          rsx.close();
          rsx = null;
        }
      } catch (SQLException sex) {
        sex.printStackTrace();
      }
      try {
        if (stmx!= null) {
          stmx.close();
          stmx = null;
        }
      } catch (SQLException sex) {
        sex.printStackTrace();
      }
      try {
        if (conx!= null) {
          conx.close();
          conx = null;
        }
      } catch (SQLException sex) {
        sex.printStackTrace();
      }
    }
  }
}