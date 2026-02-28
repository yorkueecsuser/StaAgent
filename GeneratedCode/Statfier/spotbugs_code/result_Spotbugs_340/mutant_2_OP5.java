import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

class OpenDatabase {
  public void openConnection() throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc url");
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("Reachable case 1");
        break;
    }
  }

  public void openDSConnection(DataSource ds) throws SQLException {
    Connection conn1 = ds.getConnection();
    Connection conn2 = ds.getConnection("scott", "tiger");
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("Reachable case 1");
        break;
    }
  }

  public void openStatement(Connection conn) throws SQLException {
    Statement statement = conn.createStatement();
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("Reachable case 1");
        break;
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
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("Reachable case 1");
        break;
    }
    return id;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}