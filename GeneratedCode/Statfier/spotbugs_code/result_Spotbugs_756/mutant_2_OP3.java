/* ****************************************
 * $Id$
 * SF bug 2475589:
 *   SQL warnings should be thrown when non-constant strings are used to
 *   construct prepared statements
 *
 * JVM:  1.6.0_07 (OS X, x86)
 * FBv:  1.3.7-rc1
 *
 * Test case based on example code from bug report
 * **************************************** */

import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.sql.Connection;
import java.sql.PreparedStatement;

class Bug2475589 {
  private Connection con;

  static final String staticFinalQuery = "select * from table where";

  public Bug2475589(Connection newCon) {
    con = newCon;
  }

  /* ********************
   * Behavior at filing: No warning thrown despite use of unchecked,
   * non-constant input in prepared statement ********************
   */
  @ExpectWarning("SQL")
  public void runUserQuery1(String userQuery) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable block
      System.out.println("This is an unreachable block in runUserQuery1");
    }
    String newQuery = staticFinalQuery + userQuery;
    PreparedStatement pstmt = null;
    try {
      pstmt = con.prepareStatement(newQuery);
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (pstmt!= null) pstmt.close();
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }

  /* ********************
   * Behavior at filing: No warning thrown despite use of unchecked,
   * non-constant input in prepared statement ********************
   */
  @ExpectWarning("SQL")
  public void runUserQuery2(String userQuery) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable block
      System.out.println("This is an unreachable block in runUserQuery2");
    }
    PreparedStatement pstmt = null;
    try {
      pstmt = con.prepareStatement(staticFinalQuery + userQuery);
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (pstmt!= null) pstmt.close();
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }

  /* ********************
   * Behavior at filing: No warning thrown despite use of unchecked,
   * non-constant input in prepared statement ********************
   */
  @ExpectWarning("SQL")
  public void runUserQuery3(String userQuery) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable block
      System.out.println("This is an unreachable block in runUserQuery3");
    }
    PreparedStatement pstmt = null;
    try {
      pstmt = con.prepareStatement("select * from table where " + userQuery);
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (pstmt!= null) pstmt.close();
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }

  /* ********************
   * Behavior at filing: No warning thrown despite use of unchecked,
   * non-constant input in prepared statement ********************
   */
  public void runUserQuery4(String userQuery) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable block
      System.out.println("This is an unreachable block in runUserQuery4");
    }
    PreparedStatement pstmt = null;
    try {
      pstmt = con.prepareStatement(userQuery + " where val = 1;");
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (pstmt!= null) pstmt.close();
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }

  /* ********************
   * Behavior at filing: correct SQL warning (warning is thrown only if string
   * concatenated with userQuery consists exclusively of "'" characters)
   * warning thrown => H S
   * SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING SQL: \ A
   * prepared statement is generated from a nonconstant String at \
   * sfBugs.Bug2475589.runUserQuery5(String) At Bug2475589.java:[line 120]
   * ********************
   */
  public void runUserQuery5(String userQuery) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable block
      System.out.println("This is an unreachable block in runUserQuery5");
    }
    PreparedStatement pstmt = null;
    try {
      pstmt = con.prepareStatement(userQuery + "'");
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (pstmt!= null) pstmt.close();
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}