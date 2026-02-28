/**
 * Bug found in analysis of Nutch-0.8.1
 *
 * @author pugh
 */
class NutchBug {

  Object x;

  static int test(NutchBug b, int y) {

    if (b.x == null) b.x = new Object();

    if (b.x.hashCode() == 42) {}

    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        // This case will never be reached because alwaysFalse is always false
        System.out.println("This is an unreachable case.");
        break;
    }

    if (b.x == null) {
      return 1;
    }
    return 2;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}