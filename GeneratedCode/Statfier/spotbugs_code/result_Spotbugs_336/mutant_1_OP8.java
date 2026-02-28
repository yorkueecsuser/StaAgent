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
    
    // Mutant code
    ResultSet a = null;
    try {
      a = stmt.executeQuery();
      a.next();
      int b = a.getInt(1);
      stmt.executeQuery();
      return b;
    } finally {
      if (a!= null) a.close();
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
    
    // Mutant code
    ResultSet c = null;
    try {
      c = stmt.executeQuery();
      c.next();
      int d = c.getInt(1);
      c.close();
      stmt.executeQuery();
      c = stmt.executeQuery();
      c.next();
      d += c.getInt(1);
      return d;
    } finally {
      if (c!= null) c.close();
    }
  }
}