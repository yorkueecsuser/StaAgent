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

      // Introduced unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          // This case will never be executed
          System.out.println("This is an unreachable case.");
          break;
      }
    }
    return n.hashCode();
  }

  // Method to provide a dynamic condition that is always false
  static boolean getAlwaysFalse() {
    return false;
  }
}