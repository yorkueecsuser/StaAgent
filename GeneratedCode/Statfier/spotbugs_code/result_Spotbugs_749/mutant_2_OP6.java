/**
 * Bug found in analysis of Nutch-0.8.1
 *
 * @author pugh
 */
class NutchBug {

  Object x;

  static int test(NutchBug b, int y) {

    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will be false at runtime
    }

    if (b.x == null) b.x = new Object();

    if (b.x.hashCode() == 42) {}

    if (b.x == null) {
      return 1;
    }
    return 2;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}