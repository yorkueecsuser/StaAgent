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

      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable block");
      } else {
        // Alternative block that also will never execute due to the same condition
        System.out.println("This is another unreachable block");
      }
    }
    return n.hashCode();
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}