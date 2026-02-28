/* ****************************************
 * $Id$
 * SF bug 2612987:
 *   Type qualifier false positive with JSR 305 @Nonnegative annotation
 *
 * JVM:  1.6.0 (OS X, x86)
 * FBv:  1.3.8-dev-20090217
 *
 * Test case based on example code from bug report
 * **************************************** */

import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import javax.annotation.CheckForSigned;
import javax.annotation.Nonnegative;

class Bug2612987 {
  @Nonnegative private int nonNegativeValue = 1;

  @Nonnegative
  public int get() {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      nonNegativeValue = -1; // This line will never be executed
    }
    return nonNegativeValue;
  }

  /* ********************
   * Behavior at filing: TQ warning thrown for explicitly checked (and
   * annotated) parameter ********************
   */
  @DesireNoWarning("TQ")
  public void set(@CheckForSigned int possibleNegativeValue) {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      possibleNegativeValue = -1; // This line will never be executed
    }
    if (possibleNegativeValue >= 0) nonNegativeValue = possibleNegativeValue;
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This method always returns false, making the while loop unreachable
  }
}