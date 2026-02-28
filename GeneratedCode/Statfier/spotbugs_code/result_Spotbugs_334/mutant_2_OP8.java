import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Now Bug1116 */
class Bug3566803 {

  @ExpectWarning("ODR_OPEN_DATABASE_RESOURCE")
  public void notReported(String url, String username, String password) throws Exception {
    for (int i = 0; i < 10; i++) {
      if (i > 5) {
        Connection x = DriverManager.getConnection(url, username, password);
        PreparedStatement y = x.prepareStatement("SELECT count(1) from tab");
        ResultSet z = y.executeQuery();
        while (z.next()) {
          System.out.println(z.getString(1));
        }
      }
    }
  }

  @ExpectWarning("ODR_OPEN_DATABASE_RESOURCE")
  public void isReported(String url, String username, String password) throws Exception {
    Connection a = DriverManager.getConnection(url, username, password);
    PreparedStatement b = a.prepareStatement("SELECT count(1) from tab");
    ResultSet c = b.executeQuery();
    while (c.next()) {
      System.out.println(c.getString(1));
    }
  }

  @DesireWarning("ODR_OPEN_DATABASE_RESOURCE")
  public static void main(String... strings) {
    Connection d = null;
    PreparedStatement e = null;
    ResultSet f = null;
    try {
      String driverName = "oracle.jdbc.driver.OracleDriver";
      Class.forName(driverName);
      String g = "";
      String h = "";
      String i = "";

      // Bug: We only close the resources opened in the last iteration
      for (int j = 0; j < 10; j++) {
        d = DriverManager.getConnection(g, h, i);

        e = d.prepareStatement("SELECT count(1) from tab");

        f = e.executeQuery();
        while (f.next()) {
          System.out.println(f.getString(1));
        }
      }
    } catch (ClassNotFoundException k) {
      k.printStackTrace();
    } catch (SQLException l) {
      System.out.println("SQLException" + l.getMessage());
    } finally {
      try {
        if (f!= null) f.close();
      } catch (SQLException m) {
        m.printStackTrace();
      }
      try {
        if (e!= null) e.close();
      } catch (SQLException n) {
        n.printStackTrace();
      }
      try {
        if (d!= null) d.close();
      } catch (SQLException o) {
        o.printStackTrace();
      }
    }
  }
}