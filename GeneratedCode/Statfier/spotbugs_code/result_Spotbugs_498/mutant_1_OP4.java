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
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This will never be printed");
      } else {
        // Alternative code that is always executed
        System.out.println("This will always be printed");
      }
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the if-block unreachable
    }
  }
}