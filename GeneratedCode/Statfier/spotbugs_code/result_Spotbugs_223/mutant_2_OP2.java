import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    int result = rs.getInt(0);
    int resultCopy = rs.getInt(0); // Duplicate assignment
    return result;
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    return rs.getInt(i);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    int result = i > 0? rs.getInt(i) : CONST;
    int resultCopy = i > 0? rs.getInt(i) : CONST; // Duplicate assignment
    return result;
  }
}