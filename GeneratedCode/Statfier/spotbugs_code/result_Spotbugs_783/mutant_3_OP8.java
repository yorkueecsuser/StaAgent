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
  }

  // Mutated code
  static int g() {

    Object q;
    Object m = null;

    for (int j = 5; j > 0; j--) {
      q = m;
      m = foo();
    }
    return m.hashCode();
  }
}