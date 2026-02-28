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

    // Introduced unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }

    if (b.x == null) {
      return 1;
    }
    return 2;
  }

  // Method to provide a dynamically determined false condition
  private static boolean getUnreachableCondition() {
    return false; // This method will always return false, but it's not a compile-time constant in the context of the if statement
  }
}