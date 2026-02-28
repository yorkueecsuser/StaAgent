import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    return rs.getInt(0);
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    return rs.getInt(i);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    return i > 0? rs.getInt(i) : CONST;
  }

  // Mutated code
  public int getInt0(ResultSet rsx) throws SQLException {
    return rsx.getInt(0);
  }

  public int getInt(ResultSet rsx, int j) throws SQLException {
    return rsx.getInt(j);
  }

  private final int CONSTx = 7;

  public int getIntCheck(ResultSet rsx, int j) throws SQLException {
    return j > 0? rsx.getInt(j) : CONSTx;
  }
}