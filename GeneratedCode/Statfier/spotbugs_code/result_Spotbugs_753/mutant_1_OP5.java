/* ****************************************
 * $Id$
 * SF bug 1993328:
 *   missed EI_EXPOSE_REP2 (EI2) bug on assignment
 *   in conditional branch
 *
 * JVM:  1.5.0_16 (OS X, PPC)
 * FBv:  1.3.7-dev-20081121
 *
 * Test case based on example code from bug report
 * **************************************** */

import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug1993328 {
  private static Object[] NO_ARGS = new Object[] {};

  private Object[] args1;

  /* ********************
   * Behavior at filing: no warning thrown ********************
   */
  @DesireWarning("EI2")
  public void assign_conditional(Object[] args) {
    this.args1 = args == null? NO_ARGS : args;
    
    // Unreachable switch statement mutant
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to avoid compiler warnings
        break;
    }
  }

  /* ********************
   * Behavior at filing: warning thrown => M V EI2:
   * Bug1993328.assign_explicit(Object[]) may expose internal representation
   * by storing an externally mutable object into args1 At
   * Bug1993328.java:[line 15] ********************
   */
  @ExpectWarning("EI2")
  public void assign_explicit(Object[] args) {
    this.args1 = args;
    
    // Unreachable switch statement mutant
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is another unreachable case");
        break;
      default:
        // Default case to avoid compiler warnings
        break;
    }
  }

  // dummy method, eliminates 'unread field' warning
  public boolean hasargs() {
    if (args1!= null) {
      return true;
    }
    return false;
  }

  // Method to provide a dynamic condition for the switch statement
  private boolean getCondition() {
    return false;
  }
}