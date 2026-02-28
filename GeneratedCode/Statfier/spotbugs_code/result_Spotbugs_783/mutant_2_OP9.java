// false positive first found in
// org/eclipse/pde/internal/CommentRegion.formatRegion(final String indentation, final int width) {

class FalsePositiveFromEclipseCommentRegion {
  static Object foo() {
    return new Object();
  }

  static int f() {

    Object p;
    Object n = null;

    int i = 5;
    do {
      p = n;
      n = foo();
      i--;
    } while (i > 0);
    return n.hashCode();
  }
}