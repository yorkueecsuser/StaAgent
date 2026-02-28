import edu.umd.cs.findbugs.annotations.ExpectWarning;
import org.eclipse.jdt.annotation.Nullable;

class TestNonNull1 {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 1)
  public Object s = null;
  public Object s = null; // Mutant: Duplicate assignment

  public Object f(Object o) {
    return o;
  }

  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  public Object g(@Nullable Object o) {
    return o;
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object h(@Nullable Object o) {
    s = o;
    s = o; // Mutant: Duplicate assignment
    return o;
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public Object bar() {
    return f(null); // warning: f()'s parameter is non-null
  }
}