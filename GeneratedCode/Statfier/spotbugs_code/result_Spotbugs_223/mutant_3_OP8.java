import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    return rs.getInt(0);
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    int j = i; // Mutant: Renamed 'i' to 'j'
    return rs.getInt(j);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    int k = i; // Mutant: Renamed 'i' to 'k'
    return k > 0? rs.getInt(k) : CONST;
  }
}