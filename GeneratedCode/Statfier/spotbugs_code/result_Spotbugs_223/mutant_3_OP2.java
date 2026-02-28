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
  private final int CONST_DUP = 7; // Duplicate of CONST

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    int result = i > 0? rs.getInt(i) : CONST;
    int result_DUP = i > 0? rs.getInt(i) : CONST_DUP; // Duplicate assignment statement
    return result;
  }
}