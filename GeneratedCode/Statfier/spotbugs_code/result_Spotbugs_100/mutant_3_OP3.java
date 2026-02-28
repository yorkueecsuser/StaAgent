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

    // Mutant code: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement due to the condition always being false.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}