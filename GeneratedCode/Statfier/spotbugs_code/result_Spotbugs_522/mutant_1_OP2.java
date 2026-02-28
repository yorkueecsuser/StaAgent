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
      conn = DriverManager.getConnection(url); // Mutation: duplicated assignment
      stm = conn.createStatement();
      stm = conn.createStatement(); // Mutation: duplicated assignment

      for (String schema : schemas) {
        String sql = "create schema " + schema + ";";
        sql = "create schema " + schema + ";"; // Mutation: duplicated assignment
        stm.executeUpdate(sql);
      }
    } catch (SQLException e) {
      log("exception", e);
    } finally {
      if (stm!= null)
        try {
          stm.close();
          stm.close(); // Mutation: duplicated assignment
        } catch (SQLException e1) {
          log("exception", e1);
        }
      if (null!= conn) {
        try {
          conn.close();
          conn.close(); // Mutation: duplicated assignment
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
        e.close(); // Mutation: duplicated assignment
      } catch (IOException e1) {
        log("Could not close", e1);
      }
  }

  public static void closeQuietly(Statement e) {
    if (e!= null)
      try {
        e.close();
        e.close(); // Mutation: duplicated assignment
      } catch (Exception e1) {
        log("Could not close", e1);
      }
  }

  public static void closeQuietly(Connection e) {
    if (e!= null)
      try {
        e.close();
        e.close(); // Mutation: duplicated assignment
      } catch (Exception e1) {
        log("Could not close", e1);
      }
  }

  public static void log(String msg, Exception e) {
    System.out.println(msg);
  }
}