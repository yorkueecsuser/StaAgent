/**
 * Bug found in analysis of Nutch-0.8.1
 *
 * @author pugh
 */
class NutchBug {

  Object x;

  static int test(NutchBug b, int y) {

    if (b.x == null) b.x = new Object();

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }

    if (b.x.hashCode() == 42) {}

    if (b.x == null) {
      return 1;
    }
    return 2;
  }

  // Method to provide a dynamic condition that evaluates to false
  private static boolean getCondition() {
    return false;
  }
}