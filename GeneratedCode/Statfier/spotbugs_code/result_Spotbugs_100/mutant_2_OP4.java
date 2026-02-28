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

    // Introduced unreachable if-else statement
    boolean alwaysFalse = getAlwaysFalse();
    if (alwaysFalse) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will always be printed");
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}