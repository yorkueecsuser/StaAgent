/**
 * Bug found in analysis of Nutch-0.8.1
 *
 * @author pugh
 */
class NutchBug {

  Object x;

  static int test(NutchBug b, int y) {

    boolean condition = getCondition();

    if (b.x == null) b.x = new Object();

    if (b.x.hashCode() == 42) {}

    if (b.x == null) {
      return 1;
    }

    // Inserting unreachable if-else branch
    if (condition) {
      // This block is reachable only if condition is true
    } else {
      // This block is unreachable because condition is always false
    }

    return 2;
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}