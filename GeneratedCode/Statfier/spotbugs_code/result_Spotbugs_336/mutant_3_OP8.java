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
  public int foo(PreparedStatement q) throws Exception {
    ResultSet t = null;
    try {
      t = q.executeQuery();
      t.next();
      int y = t.getInt(1);
      q.executeQuery();
      return y;
    } finally {
      if (t!= null) t.close();
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
  public int foo2(PreparedStatement p) throws Exception {
    ResultSet s = null;
    try {
      s = p.executeQuery();
      s.next();
      int z = s.getInt(1);
      s.close();
      p.executeQuery();
      s = p.executeQuery();
      s.next();
      z += s.getInt(1);
      return z;
    } finally {
      if (s!= null) s.close();
    }
  }
}