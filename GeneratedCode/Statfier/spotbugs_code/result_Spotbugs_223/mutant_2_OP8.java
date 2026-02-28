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
  public int getInt0(ResultSet x) throws SQLException {
    return x.getInt(0);
  }

  public int getInt(ResultSet y, int j) throws SQLException {
    return y.getInt(j);
  }

  private final int VALUE = 7;

  public int getIntCheck(ResultSet z, int k) throws SQLException {
    return k > 0? z.getInt(k) : VALUE;
  }
}