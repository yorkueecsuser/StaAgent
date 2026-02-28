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
      
      // Unreachable if statement mutation
      boolean condition = getCondition();
      if (condition) {
        // This block is intended to be unreachable
        System.out.println("This should never be printed");
      }
    }
    return n.hashCode();
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}