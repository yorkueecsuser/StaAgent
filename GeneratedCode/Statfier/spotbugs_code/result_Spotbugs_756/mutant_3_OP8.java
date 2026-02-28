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
  private Connection a;

  static final String staticFinalQuery = "select * from table where";

  public Bug2475589(Connection newCon) {
    a = newCon;
  }

  /* ********************
   * Behavior at filing: No warning thrown despite use of unchecked,
   * non-constant input in prepared statement ********************
   */
  @ExpectWarning("SQL")
  public void runUserQuery1(String b) {
    String c = staticFinalQuery + b;
    PreparedStatement d = null;
    try {
      d = a.prepareStatement(c);
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (d!= null) d.close();
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }

  /* ********************
   * Behavior at filing: No warning thrown despite use of unchecked,
   * non-constant input in prepared statement ********************
   */
  @ExpectWarning("SQL")
  public void runUserQuery2(String b) {
    PreparedStatement d = null;
    try {
      d = a.prepareStatement(staticFinalQuery + b);
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (d!= null) d.close();
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }

  /* ********************
   * Behavior at filing: No warning thrown despite use of unchecked,
   * non-constant input in prepared statement ********************
   */
  @ExpectWarning("SQL")
  public void runUserQuery3(String b) {
    PreparedStatement d = null;
    try {
      d = a.prepareStatement("select * from table where " + b);
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (d!= null) d.close();
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }

  /* ********************
   * Behavior at filing: No warning thrown despite use of unchecked,
   * non-constant input in prepared statement ********************
   */
  public void runUserQuery4(String b) {
    PreparedStatement d = null;
    try {
      d = a.prepareStatement(b + " where val = 1;");
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (d!= null) d.close();
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
  public void runUserQuery5(String b) {
    PreparedStatement d = null;
    try {
      d = a.prepareStatement(b + "'");
    } catch (Exception e) {
      System.out.println("Got exception");
    }
    try {
      if (d!= null) d.close();
    } catch (Exception e) {
      System.out.println("Got exception");
    }
  }
}