/**
 * False positive SA_LOCAL_SELF_COMPARISON reported on number when using instanceof pattern matching
 * in Java 14.
 *
 * @author Ken Schosinsky
 */
class IncorrectSelfComparisonInstanceOfPatternMatching {

  public static void instanceofPatternMatching() {
    Number number = 1f;
    if (number instanceof Float f) {
      System.out.println("number is a float: " + f);
    }

    // Mutant code: Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This will never be printed because condition is always false.");
    } else {
      // Alternative code
      System.out.println("This will always be printed because condition is always false.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}