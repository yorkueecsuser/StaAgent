// false positive first found in
// org/eclipse/pde/internal/CommentRegion.formatRegion(final String indentation, final int width) {

class FalsePositiveFromEclipseCommentRegion {
  static Object foo() {
    return new Object();
  }

  static int f() {

    Object p;
    Object n = null;

    // Dead store mutation
    int qzjfnrht = 42; // Unique dead store variable

    for (int i = 5; i > 0; i--) {
      p = n;
      n = foo();
    }
    return n.hashCode();
  }
}