import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

class OpenDatabase {
  public void openConnection() throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc url");
    // Mutant: Renamed 'conn' to 'a'
    Connection a = DriverManager.getConnection("jdbc url");
  }

  public void openDSConnection(DataSource ds) throws SQLException {
    Connection conn1 = ds.getConnection();
    Connection conn2 = ds.getConnection("scott", "tiger");
    // Mutant: Renamed 'conn1' to 'b'
    Connection b = ds.getConnection();
    // Mutant: Renamed 'conn2' to 'c'
    Connection c = ds.getConnection("scott", "tiger");
  }

  public void openStatement(Connection conn) throws SQLException {
    Statement statement = conn.createStatement();
    // Mutant: Renamed'statement' to 'd'
    Statement d = conn.createStatement();
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
    return id;
    // Mutant: Renamed 'id' to 'e'
    int e = 0;
    return e;
  }
}

// vim:ts=3