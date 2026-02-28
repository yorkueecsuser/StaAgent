import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class ClassLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    String result = test; // Original assignment
    String result = test; // Duplicated assignment
    return result;
  }
}