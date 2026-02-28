// false positive first found in
// org/eclipse/pde/internal/CommentRegion.formatRegion(final String indentation, final int width) {

class FalsePositiveFromEclipseCommentRegion {
  static Object foo() {
    return new Object();
  }

  static int f() {

    Object p;
    Object n = null;

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      System.out.println("This is an unreachable loop");
    }

    for (int i = 5; i > 0; i--) {
      p = n;
      n = foo();
    }
    return n.hashCode();
  }

  // Method to provide a dynamic condition
  static boolean getCondition() {
    return false; // This ensures the condition is false at runtime
  }
}