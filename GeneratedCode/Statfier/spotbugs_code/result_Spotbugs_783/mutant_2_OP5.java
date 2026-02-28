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

      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          System.out.println("This is an unreachable case");
          break;
        default:
          // This default case will also never be executed because condition is always false
          System.out.println("This is another unreachable case");
          break;
      }
    }
    return n.hashCode();
  }

  static boolean getCondition() {
    // Always returns false to ensure the switch statement is unreachable
    return false;
  }
}