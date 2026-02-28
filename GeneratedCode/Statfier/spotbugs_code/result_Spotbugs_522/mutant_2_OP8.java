import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Bug20070301 {

  public static void falsePositive(String url, String[] schemas) {
    Connection conn = null;
    Statement stm = null;
    try {
      conn = DriverManager.getConnection(url);
      stm = conn.createStatement();

      for (String schema : schemas) {
        String sql = "create schema " + schema + ";";
        stm.executeUpdate(sql);
      }
    } catch (SQLException e) {
      log("exception", e);
    } finally {
      if (stm!= null)
        try {
          stm.close();
        } catch (SQLException e1) {
          log("exception", e1);
        }
      if (null!= conn) {
        try {
          conn.close();
        } catch (SQLException e) {
          log("exception", e);
        }
      }
    }

    // Mutated code
    Connection a = null;
    Statement b = null;
    try {
      a = DriverManager.getConnection(url);
      b = a.createStatement();

      for (String c : schemas) {
        String d = "create schema " + c + ";";
        b.executeUpdate(d);
      }
    } catch (SQLException e) {
      log("exception", e);
    } finally {
      if (b!= null)
        try {
          b.close();
        } catch (SQLException e1) {
          log("exception", e1);
        }
      if (null!= a) {
        try {
          a.close();
        } catch (SQLException e) {
          log("exception", e);
        }
      }
    }
  }

  public static void closeQuietly(Closeable e) {
    if (e!= null)
      try {
        e.close();
      } catch (IOException e1) {
        log("Could not close", e1);
      }
  }

  public static void closeQuietly(Statement e) {
    if (e!= null)
      try {
        e.close();
      } catch (Exception e1) {
        log("Could not close", e1);
      }
  }

  public static void closeQuietly(Connection e) {
    if (e!= null)
      try {
        e.close();
      } catch (Exception e1) {
        log("Could not close", e1);
      }
  }

  public static void log(String msg, Exception e) {
    System.out.println(msg);
  }
}