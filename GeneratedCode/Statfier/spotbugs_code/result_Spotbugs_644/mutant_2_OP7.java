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

    // Inserted unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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

    // Inserted unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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

    // Inserted unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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

    // Inserted unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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

    // Inserted unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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

    // Inserted unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
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

  // Method to provide a dynamic condition for the unreachable while loop
  private boolean getCondition() {
    return false;
  }
}