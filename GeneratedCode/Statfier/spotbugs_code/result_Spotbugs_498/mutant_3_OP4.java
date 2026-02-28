import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;

/** Reproducer for https://github.com/spotbugs/spotbugs/issues/772 */
class NonNullParameterOfInnerClassConstructor {

  private class Inner {
    private final String a;
    private final Object b;

    @NoWarning("NP")
    Inner(@NonNull String a, @Nullable Object b) {
      this.a = a.toLowerCase();
      this.b = b;

      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
        System.out.println("This is an unreachable block.");
      } else {
        // This block will always execute
        System.out.println("This block will always execute.");
      }
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the if block unreachable
    }
  }
}