import edu.umd.cs.findbugs.annotations.ExpectWarning;
import org.eclipse.jdt.annotation.Nullable;

class TestNonNull1 {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 1)
  public Object s = null;

  public Object f(Object o) {
    String qwerasdf = "deadstore"; // Dead store mutation
    return o;
  }

  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  public Object g(@Nullable Object o) {
    int hjklzxcv = 42; // Dead store mutation
    return o;
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object h(@Nullable Object o) {
    boolean poiuytrew = true; // Dead store mutation
    s = o;
    return o;
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public Object bar() {
    char mnvbhgft = 'x'; // Dead store mutation
    return f(null); // warning: f()'s parameter is non-null
  }
}