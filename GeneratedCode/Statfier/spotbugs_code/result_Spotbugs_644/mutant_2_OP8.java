import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.WillClose;

class Bug3415313 {

  public void original(Connection sesscon) throws SQLException {
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      StringBuffer sql = new StringBuffer();
      sql.append("SELECT groupcounter,");
      sql.append(" grouppoolcode,");
      sql.append(" groupdescription");
      sql.append(" FROM DataGroup");
      sql.append(" ORDER BY groupcounter");
      ps = sesscon.prepareStatement(sql.toString());
      int col = 1;
      rs = ps.executeQuery();
      while (rs.next()) {
        // get the data
      }
    } finally {
      WorkflowUtils.closeResultSet(rs);
      WorkflowUtils.closeStatement(ps);
    }
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  public void fp1(Connection sesscon) throws SQLException {
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = sesscon.prepareStatement("query");
      try {
        rs = ps.executeQuery();
        while (rs.next()) {
          // get the data
        }
      } finally {
        WorkflowUtils.closeResultSet(rs);
      }
    } finally {
      WorkflowUtils.closeStatement(ps);
    }
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  public void fp1(PreparedStatement ps) throws SQLException {
    ResultSet rs = null;
    try {
      rs = ps.executeQuery();
      while (rs.next()) {
        // get the data
      }
    } finally {
      WorkflowUtils.closeResultSet(rs);
    }
  }

  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION")
  public void tp(Connection sesscon) throws SQLException {
    PreparedStatement ps = null;
    ResultSet rs = null;

    StringBuffer sql = new StringBuffer();
    sql.append("SELECT groupcounter,");
    sql.append(" grouppoolcode,");
    sql.append(" groupdescription");
    sql.append(" FROM DataGroup");
    sql.append(" ORDER BY groupcounter");
    ps = sesscon.prepareStatement(sql.toString());
    int col = 1;
    rs = ps.executeQuery();
    while (rs.next()) {
      // get the data
    }
  }

  @DesireWarning(value = "OBL_UNSATISFIED_OBLIGATION", confidence = Confidence.LOW)
  public void maybe(Connection sesscon) throws SQLException {
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = sesscon.prepareStatement("SELECT groupcounter FROM DataGroup");
      rs = ps.executeQuery();
      try {
        while (rs.next()) {
          // get the data
        }
      } finally {
        WorkflowUtils.bar(rs);
      }
    } finally {
      System.out.println("yo");
      WorkflowUtils.baz(ps);
    }
  }

  @DesireWarning(value = "OBL_UNSATISFIED_OBLIGATION", confidence = Confidence.MEDIUM)
  public void tp2(Connection sesscon) throws SQLException {
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      ps = sesscon.prepareStatement("SELECT groupcounter FROM DataGroup");
      try {
        rs = ps.executeQuery();
        while (rs.next()) {
          // get the data
        }
      } finally {
        WorkflowUtils.bar();
      }
    } finally {
      WorkflowUtils.baz();
    }
  }

  // Mutated Code
  public void original_mutated(Connection sesscon) throws SQLException {
    PreparedStatement x = null;
    ResultSet y = null;
    try {
      StringBuffer z = new StringBuffer();
      z.append("SELECT groupcounter,");
      z.append(" grouppoolcode,");
      z.append(" groupdescription");
      z.append(" FROM DataGroup");
      z.append(" ORDER BY groupcounter");
      x = sesscon.prepareStatement(z.toString());
      int a = 1;
      y = x.executeQuery();
      while (y.next()) {
        // get the data
      }
    } finally {
      WorkflowUtils.closeResultSet(y);
      WorkflowUtils.closeStatement(x);
    }
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  public void fp1_mutated(Connection sesscon) throws SQLException {
    PreparedStatement b = null;
    ResultSet c = null;
    try {
      b = sesscon.prepareStatement("query");
      try {
        c = b.executeQuery();
        while (c.next()) {
          // get the data
        }
      } finally {
        WorkflowUtils.closeResultSet(c);
      }
    } finally {
      WorkflowUtils.closeStatement(b);
    }
  }

  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  public void fp1_mutated(PreparedStatement d) throws SQLException {
    ResultSet e = null;
    try {
      e = d.executeQuery();
      while (e.next()) {
        // get the data
      }
    } finally {
      WorkflowUtils.closeResultSet(e);
    }
  }

  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION")
  public void tp_mutated(Connection sesscon) throws SQLException {
    PreparedStatement f = null;
    ResultSet g = null;

    StringBuffer h = new StringBuffer();
    h.append("SELECT groupcounter,");
    h.append(" grouppoolcode,");
    h.append(" groupdescription");
    h.append(" FROM DataGroup");
    h.append(" ORDER BY groupcounter");
    f = sesscon.prepareStatement(h.toString());
    int i = 1;
    g = f.executeQuery();
    while (g.next()) {
      // get the data
    }
  }

  @DesireWarning(value = "OBL_UNSATISFIED_OBLIGATION", confidence = Confidence.LOW)
  public void maybe_mutated(Connection sesscon) throws SQLException {
    PreparedStatement j = null;
    ResultSet k = null;
    try {
      j = sesscon.prepareStatement("SELECT groupcounter FROM DataGroup");
      k = j.executeQuery();
      try {
        while (k.next()) {
          // get the data
        }
      } finally {
        WorkflowUtils.bar(k);
      }
    } finally {
      System.out.println("yo");
      WorkflowUtils.baz(j);
    }
  }

  @DesireWarning(value = "OBL_UNSATISFIED_OBLIGATION", confidence = Confidence.MEDIUM)
  public void tp2_mutated(Connection sesscon) throws SQLException {
    PreparedStatement l = null;
    ResultSet m = null;
    try {
      l = sesscon.prepareStatement("SELECT groupcounter FROM DataGroup");
      try {
        m = l.executeQuery();
        while (m.next()) {
          // get the data
        }
      } finally {
        WorkflowUtils.bar();
      }
    } finally {
      WorkflowUtils.baz();
    }
  }

  static class WorkflowUtils {
    private static void baz(PreparedStatement ps) {}

    public static void bar(ResultSet rs) {}

    private static void baz() {}

    public static void bar() {}

    public static void closeStatement(@WillClose PreparedStatement ps) {
      try {
        if (ps!= null) ps.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    private static void closeResultSet(ResultSet rs) {
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}