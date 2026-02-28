import java.sql.ResultSet;
import java.sql.SQLException;

class Bug1942828 {
  public int getInt0(ResultSet rs) throws SQLException {
    int qvwxyzab; // Dead store
    return rs.getInt(0);
  }

  public int getInt(ResultSet rs, int i) throws SQLException {
    String rstuvwxy; // Dead store
    return rs.getInt(i);
  }

  private final int CONST = 7;

  public int getIntCheck(ResultSet rs, int i) throws SQLException {
    double mnopqrst; // Dead store
    return i > 0? rs.getInt(i) : CONST;
  }
}