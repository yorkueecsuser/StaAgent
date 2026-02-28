/* ****************************************
 * $Id$
 * SF bug 2207693:
 *   OBL False positive on java.sql.executeQuery close
 *
 * JVM:  1.5.0_16 (OS X, PPC)
 * FBv:  1.3.7-dev-20081212
 *
 * Test case based on example code from bug report
 * **************************************** */

import edu.umd.cs.findbugs.annotations.NoWarning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Bug2207693 {
  private Connection con;

  private String statement;

  public Bug2207693(Connection newCon, String newStatement) {
    con = newCon;
    statement = newStatement;
  }

  /* ********************
   * Behavior at filing: OBL false positive According to API documentation,
   * PreparedStatement close() method should also close current ResultSet
   * object. See docs:
   * <http://java.sun.com/javase/6/docs/api/java/sql/PreparedStatement.html>
   * warning thrown => M X OBL_UNSATISFIED_OBLIGATION OBL: Method
   * sfBugs.Bug2207693.execute() \ may fail to clean up stream or resource of
   * type java.sql.ResultSet \ Obligation to clean up resource created at \
   * Bug2207693.java:[line 39] is not discharged ********************
   */
  @NoWarning("OBL")
  public void execute() {
    /* test code adapted from bug report */
    try {
      final PreparedStatement ps = con.prepareStatement(statement);
      try {
        final ResultSet rs = ps.executeQuery();

        /* eliminate dead local store warning */
        if (rs!= null) {
          System.out.println("Okay!");
        }

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          System.out.println("This will never run");
        } else {
          System.out.println("This will also never run");
        }
      } finally {
        ps.close();
      }
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the condition is always false at runtime
  }
}