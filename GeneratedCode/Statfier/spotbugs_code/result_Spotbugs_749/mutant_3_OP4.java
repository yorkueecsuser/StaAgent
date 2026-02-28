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

    // Inserting an unreachable if-else branch
    if (condition) {
      // This block is unreachable because condition is dynamically determined and set to false
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable for the same reason
      System.out.println("This is another unreachable block");
    }

    return 2;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}