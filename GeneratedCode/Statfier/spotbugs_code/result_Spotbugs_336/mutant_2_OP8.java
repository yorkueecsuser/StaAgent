import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Ideas_2011_11_15 {
  public int foo(PreparedStatement stmt) throws Exception {
    ResultSet rs = null;
    try {
      rs = stmt.executeQuery();
      rs.next();
      int x = rs.getInt(1);
      stmt.executeQuery();
      return x;
    } finally {
      if (rs!= null) rs.close();
    }
  }

  // Mutant for foo method
  public int foo_m(PreparedStatement a) throws Exception {
    ResultSet b = null;
    try {
      b = a.executeQuery();
      b.next();
      int c = b.getInt(1);
      a.executeQuery();
      return c;
    } finally {
      if (b!= null) b.close();
    }
  }

  public int foo2(PreparedStatement stmt) throws Exception {
    ResultSet rs = null;
    try {
      rs = stmt.executeQuery();
      rs.next();
      int x = rs.getInt(1);
      rs.close();
      stmt.executeQuery();
      rs = stmt.executeQuery();
      rs.next();
      x += rs.getInt(1);
      return x;
    } finally {
      if (rs!= null) rs.close();
    }
  }

  // Mutant for foo2 method
  public int foo2_m(PreparedStatement d) throws Exception {
    ResultSet e = null;
    try {
      e = d.executeQuery();
      e.next();
      int f = e.getInt(1);
      e.close();
      d.executeQuery();
      e = d.executeQuery();
      e.next();
      f += e.getInt(1);
      return f;
    } finally {
      if (e!= null) e.close();
    }
  }
}