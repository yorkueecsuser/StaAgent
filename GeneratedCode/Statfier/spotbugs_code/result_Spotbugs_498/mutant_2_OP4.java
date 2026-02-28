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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a placeholder comment for the if block
      } else {
        // This is a placeholder comment for the else block
      }
      this.a = a.toLowerCase();
      this.b = b;
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }
}