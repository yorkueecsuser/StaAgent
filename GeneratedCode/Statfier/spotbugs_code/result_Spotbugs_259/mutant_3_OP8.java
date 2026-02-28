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
    PreparedStatement stm = null;
    ResultSet rss = null;
    String strr = null;
    try {
      conx = DriverManager.getConnection("", "", "");

      strr = "select * from EMPLOYEE where ID =? ";
      stm = conx.prepareStatement(strr);
      stm.setString(1, "");
      rss = stm.executeQuery();

    } catch (SQLException se) {
      se.printStackTrace();
    } finally {
      try {
        if (rss!= null) {
          rss.close();
          rss = null;
        }
      } catch (SQLException se) {
        se.printStackTrace();
      }
      try {
        if (stm!= null) {
          stm.close();
          stm = null;
        }
      } catch (SQLException se) {
        se.printStackTrace();
      }
      try {
        if (conx!= null) {
          conx.close();
          conx = null;
        }
      } catch (SQLException se) {
        se.printStackTrace();
      }
    }
  }
}