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
    }
    return n.hashCode();

    // Unreachable for loop mutation
    boolean conditionFor = getConditionForLoop();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
  }

  static boolean getConditionForLoop() {
    return false; // This method ensures the condition is false at runtime, making the loop unreachable
  }
}