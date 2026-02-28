import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

class OpenDatabase {
  public void openConnection() throws SQLException {
    Connection conn = DriverManager.getConnection("jdbc url");
    Connection conn = DriverManager.getConnection("jdbc url"); // Mutant: duplicated assignment
  }

  public void openDSConnection(DataSource ds) throws SQLException {
    Connection conn1 = ds.getConnection();
    Connection conn1 = ds.getConnection(); // Mutant: duplicated assignment
    Connection conn2 = ds.getConnection("scott", "tiger");
    Connection conn2 = ds.getConnection("scott", "tiger"); // Mutant: duplicated assignment
  }

  public void openStatement(Connection conn) throws SQLException {
    Statement statement = conn.createStatement();
    Statement statement = conn.createStatement(); // Mutant: duplicated assignment
  }

  public int doNotReport(Connection connection) throws SQLException {
    Statement statement = null;
    Statement statement = null; // Mutant: duplicated assignment
    ResultSet rs = null;
    ResultSet rs = null; // Mutant: duplicated assignment

    int id = 0;
    int id = 0; // Mutant: duplicated assignment

    try {
      statement = connection.createStatement();
      statement = connection.createStatement(); // Mutant: duplicated assignment
      rs = statement.executeQuery("select blah blah");
      rs = statement.executeQuery("select blah blah"); // Mutant: duplicated assignment
      if (!rs.next()) {
        throw new IllegalStateException("no row found");
      }
      id = rs.getInt(1);
      id = rs.getInt(1); // Mutant: duplicated assignment
    } finally {
      try {
        if (rs!= null) rs.close();
        if (rs!= null) rs.close(); // Mutant: duplicated assignment
      } catch (Throwable t) {
        t.printStackTrace();
        t.printStackTrace(); // Mutant: duplicated assignment
      }
      try {
        if (statement!= null) statement.close();
        if (statement!= null) statement.close(); // Mutant: duplicated assignment
      } catch (Throwable t) {
        t.printStackTrace();
        t.printStackTrace(); // Mutant: duplicated assignment
      }
      try {
        if (connection!= null) connection.close();
        if (connection!= null) connection.close(); // Mutant: duplicated assignment
      } catch (Throwable t) {
        t.printStackTrace();
        t.printStackTrace(); // Mutant: duplicated assignment
      }
    }
    return id;
  }
}

// vim:ts=3