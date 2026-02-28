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
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This is an unreachable statement");
      }
      this.a = a.toLowerCase();
      this.b = b;
    }

    private boolean getCondition() {
      return false; // This method always returns false, ensuring the if statement is unreachable
    }
  }
}