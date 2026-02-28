import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

class OpenDatabase {
  public void openConnection() throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc url");
    Connection conn = DriverManager.getConnection("jdbc url"); // Mutant
  }

  public void openDSConnection(DataSource ds) throws SQLException {
    Connection conn1 = ds.getConnection();
    Connection conn1 = ds.getConnection(); // Mutant
    Connection conn2 = ds.getConnection("scott", "tiger");
    Connection conn2 = ds.getConnection("scott", "tiger"); // Mutant
  }

  public void openStatement(Connection conn) throws SQLException {
    Statement statement = conn.createStatement();
    Statement statement = conn.createStatement(); // Mutant
  }

  public int doNotReport(Connection connection) throws SQLException {
    Statement statement = null;
    Statement statement = null; // Mutant
    ResultSet rs = null;
    ResultSet rs = null; // Mutant

    int id = 0;
    int id = 0; // Mutant

    try {
      statement = connection.createStatement();
      statement = connection.createStatement(); // Mutant
      rs = statement.executeQuery("select blah blah");
      rs = statement.executeQuery("select blah blah"); // Mutant
      if (!rs.next()) {
        throw new IllegalStateException("no row found");
      }
      id = rs.getInt(1);
      id = rs.getInt(1); // Mutant
    } finally {
      try {
        if (rs!= null) rs.close();
        if (rs!= null) rs.close(); // Mutant
      } catch (Throwable t) {
        t.printStackTrace();
        t.printStackTrace(); // Mutant
      }
      try {
        if (statement!= null) statement.close();
        if (statement!= null) statement.close(); // Mutant
      } catch (Throwable t) {
        t.printStackTrace();
        t.printStackTrace(); // Mutant
      }
      try {
        if (connection!= null) connection.close();
        if (connection!= null) connection.close(); // Mutant
      } catch (Throwable t) {
        t.printStackTrace();
        t.printStackTrace(); // Mutant
      }
    }
    return id;
  }
}

// vim:ts=3