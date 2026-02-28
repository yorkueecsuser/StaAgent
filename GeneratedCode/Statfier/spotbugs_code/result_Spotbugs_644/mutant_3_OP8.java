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

  // Mutated version of original method
  public void originala(Connection sesscon) throws SQLException {
    PreparedStatement qa = null;
    ResultSet ra = null;
    try {
      StringBuffer sql = new StringBuffer();
      sql.append("SELECT groupcounter,");
      sql.append(" grouppoolcode,");
      sql.append(" groupdescription");
      sql.append(" FROM DataGroup");
      sql.append(" ORDER BY groupcounter");
      qa = sesscon.prepareStatement(sql.toString());
      int cola = 1;
      ra = qa.executeQuery();
      while (ra.next()) {
        // get the data
      }
    } finally {
      WorkflowUtils.closeResultSet(ra);
      WorkflowUtils.closeStatement(qa);
    }
  }

  // Mutated version of fp1 method with Connection parameter
  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  public void fp1a(Connection sesscon) throws SQLException {
    PreparedStatement qa = null;
    ResultSet ra = null;
    try {
      qa = sesscon.prepareStatement("query");
      try {
        ra = qa.executeQuery();
        while (ra.next()) {
          // get the data
        }
      } finally {
        WorkflowUtils.closeResultSet(ra);
      }
    } finally {
      WorkflowUtils.closeStatement(qa);
    }
  }

  // Mutated version of fp1 method with PreparedStatement parameter
  @NoWarning("OBL_UNSATISFIED_OBLIGATION")
  public void fp1a(PreparedStatement ps) throws SQLException {
    ResultSet ra = null;
    try {
      ra = ps.executeQuery();
      while (ra.next()) {
        // get the data
      }
    } finally {
      WorkflowUtils.closeResultSet(ra);
    }
  }

  // Mutated version of tp method
  @ExpectWarning("OBL_UNSATISFIED_OBLIGATION")
  public void tpa(Connection sesscon) throws SQLException {
    PreparedStatement qa = null;
    ResultSet ra = null;

    StringBuffer sql = new StringBuffer();
    sql.append("SELECT groupcounter,");
    sql.append(" grouppoolcode,");
    sql.append(" groupdescription");
    sql.append(" FROM DataGroup");
    sql.append(" ORDER BY groupcounter");
    qa = sesscon.prepareStatement(sql.toString());
    int cola = 1;
    ra = qa.executeQuery();
    while (ra.next()) {
      // get the data
    }
  }

  // Mutated version of maybe method
  @DesireWarning(value = "OBL_UNSATISFIED_OBLIGATION", confidence = Confidence.LOW)
  public void maybea(Connection sesscon) throws SQLException {
    PreparedStatement qa = null;
    ResultSet ra = null;
    try {
      qa = sesscon.prepareStatement("SELECT groupcounter FROM DataGroup");
      ra = qa.executeQuery();
      try {
        while (ra.next()) {
          // get the data
        }
      } finally {
        WorkflowUtils.bar(ra);
      }
    } finally {
      System.out.println("yo");
      WorkflowUtils.baz(qa);
    }
  }

  // Mutated version of tp2 method
  @DesireWarning(value = "OBL_UNSATISFIED_OBLIGATION", confidence = Confidence.MEDIUM)
  public void tp2a(Connection sesscon) throws SQLException {
    PreparedStatement qa = null;
    ResultSet ra = null;
    try {
      qa = sesscon.prepareStatement("SELECT groupcounter FROM DataGroup");
      try {
        ra = qa.executeQuery();
        while (ra.next()) {
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