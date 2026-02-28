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

    // Mutant code added here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This is an unreachable block.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}