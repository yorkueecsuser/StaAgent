import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;

class Bug3506402 {

  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  protected int caller(@CheckForNull Object param) {
    return param.hashCode();
  }

  // Mutated method with renamed variable
  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  protected int caller(@CheckForNull Object b) {
    return b.hashCode();
  }

  @DesireWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  protected Object method(@CheckForNull Object... params) {
    return params.length;
  }

  // Mutated method with renamed variable
  @DesireWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  protected Object method(@CheckForNull Object... x) {
    return x.length;
  }
}