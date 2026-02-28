import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Ideas_2011_11_16 {

  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION_EXCEPTION_EDGE")
  ResultSet doQuery(String query) throws SQLException {
    Connection conn = getConnection();
    Statement st = conn.createStatement(); // Mutant: Renamed'statement' to'st'
    return st.executeQuery(query);
  }

  @NoWarning("OBL")
  ResultSet doQuery2(Connection conn, String query) throws SQLException {
    Statement stmt = conn.createStatement(); // Mutant: Renamed'statement' to'stmt'
    try {
      return stmt.executeQuery(query);
    } catch (SQLException e) {
      stmt.close();
      throw e;
    }
  }

  ResultSet doQuery3(String query) throws SQLException {
    Connection c = getConnection(); // Mutant: Renamed 'conn' to 'c'
    Statement s = c.createStatement(); // Mutant: Renamed'statement' to's'
    try {
      return s.executeQuery(query);
    } catch (SQLException e) {
      s.close();
      throw e;
    }
  }

  @ExpectWarning("OBL")
  int doQuery4(String query) throws SQLException {
    Connection con = getConnection(); // Mutant: Renamed 'conn' to 'con'
    Statement stm = con.createStatement(); // Mutant: Renamed'statement' to'stm'
    try {
      ResultSet rs = stm.executeQuery(query);
      if (rs.next()) return rs.getInt(1);
      return 0;
    } catch (SQLException e) {
      stm.close();
      throw e;
    }
  }

  abstract Connection getConnection();
}