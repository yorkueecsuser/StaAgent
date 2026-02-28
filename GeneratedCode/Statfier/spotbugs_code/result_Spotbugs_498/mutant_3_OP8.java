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
    }
  }

  // Mutated code
  private class InnerMutant {
    private final String x; // Renamed 'a' to 'x'
    private final Object y; // Renamed 'b' to 'y'

    @NoWarning("NP")
    InnerMutant(@NonNull String x, @Nullable Object y) {
      this.x = x.toLowerCase();
      this.y = y;
    }
  }
}