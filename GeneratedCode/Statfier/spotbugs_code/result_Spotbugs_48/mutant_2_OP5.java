/* ****************************************
 * $Id$
 * SF bug 2602466:
 *   False positive Bx warning for Number subclass constructor when
 *   used with constant values outside the cached range.
 *
 * JVM:  1.6.0 (OS X, x86)
 * FBv:  1.3.8-dev-20090217
 *
 * Test case based on example code from bug report
 * **************************************** */

import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.HashMap;
import java.util.Map;

class Bug2602466 {

  public Map<Long, String> error_lookup = new HashMap<Long, String>();

  /* ********************
   * Behavior at filing: Bx warning thrown for a call to the Long(long)
   * constructor with a constant value outside the range of values that will
   * be cached (which is currently -128 <= x <= 127) ********************
   */
  // Now reported as a low priority issue
  public void setHighValueKey() {
    error_lookup.put(new Long(0x80000001), "Unknown error.");

    // Unreachable switch statement mutation
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed.");
        break;
      default:
        // This is the only reachable case
        break;
    }
  }

  @ExpectWarning("Bx")
  public void setLowValueKey() {
    error_lookup.put(new Long(0), "Success.");
  }

  private boolean getCondition() {
    // Always returns false to ensure the switch statement is unreachable
    return false;
  }
}