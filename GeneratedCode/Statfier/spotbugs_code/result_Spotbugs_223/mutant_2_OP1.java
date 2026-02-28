import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    int qvwjxtrk; // Dead store
    return rs.getInt(0);
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    String abcdwxyz; // Dead store
    return rs.getInt(i);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    double fghijklm; // Dead store
    return i > 0? rs.getInt(i) : CONST;
  }
}