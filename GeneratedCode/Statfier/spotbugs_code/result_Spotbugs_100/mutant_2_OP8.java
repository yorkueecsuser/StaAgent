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

    // Mutated code
    Number a = 1f;
    if (a instanceof Float b) {
      System.out.println("a is a float: " + b);
    }
  }
}