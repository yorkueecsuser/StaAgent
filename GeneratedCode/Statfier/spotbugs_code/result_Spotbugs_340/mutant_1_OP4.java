import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

class OpenDatabase {
  public void openConnection() throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc url");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code");
    }
  }

  public void openDSConnection(DataSource ds) throws SQLException {
    Connection conn1 = ds.getConnection();
    Connection conn2 = ds.getConnection("scott", "tiger");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code");
    }
  }

  public void openStatement(Connection conn) throws SQLException {
    Statement statement = conn.createStatement();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Another unreachable code
      System.out.println("This is another unreachable code");
    }
  }

  public int doNotReport(Connection connection) throws SQLException {
    Statement statement = null;
    ResultSet rs = null;

    int id = 0;

    try {
      statement = connection.createStatement();
      rs = statement.executeQuery("select blah blah");
      if (!rs.next()) {
        throw new IllegalStateException("no row found");
      }
      id = rs.getInt(1);
    } finally {
      try {
        if (rs!= null) rs.close();
      } catch (Throwable t) {
        t.printStackTrace();
      }
      try {
        if (statement!= null) statement.close();
      } catch (Throwable t) {
        t.printStackTrace();
      }
      try {
        if (connection!= null) connection.close();
      } catch (Throwable t) {
        t.printStackTrace();
      }
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code");
      } else {
        // Another unreachable code
        System.out.println("This is another unreachable code");
      }
    }
    return id;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but always returns false
  }
}

// vim:ts=3