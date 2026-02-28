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

    // Inserted unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // Alternative code
      System.out.println("This is the alternative code");
    }

    if (b.x == null) {
      return 1;
    }
    return 2;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the first branch is unreachable
  }
}