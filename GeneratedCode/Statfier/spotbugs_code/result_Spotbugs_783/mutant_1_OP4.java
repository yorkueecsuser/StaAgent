// false positive first found in
// org/eclipse/pde/internal/CommentRegion.formatRegion(final String indentation, final int width) {

class FalsePositiveFromEclipseCommentRegion {
  static Object foo() {
    return new Object();
  }

  static int f() {

    Object p;
    Object n = null;

    for (int i = 5; i > 0; i--) {
      p = n;
      n = foo();

      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        n = new Object();
      } else {
        // This block will always execute
        p = new Object();
      }
    }
    return n.hashCode();
  }

  // Method to provide a dynamic condition
  static boolean getCondition() {
    return false;
  }
}