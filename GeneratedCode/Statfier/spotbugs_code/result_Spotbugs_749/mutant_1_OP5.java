/**
 * Bug found in analysis of Nutch-0.8.1
 *
 * @author pugh
 */
class NutchBug {

  Object x;

  static int test(NutchBug b, int y) {

    boolean condition = getCondition();
    if (condition) {
      switch(getUnreachableValue()) {
        case 1:
          // This case is unreachable
          break;
        case 2:
          // This case is also unreachable
          break;
      }
    }

    if (b.x == null) b.x = new Object();

    if (b.x.hashCode() == 42) {}

    if (b.x == null) {
      return 1;
    }
    return 2;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }

  private static int getUnreachableValue() {
    return 0; // This method ensures the switch value is dynamically determined at runtime
  }
}