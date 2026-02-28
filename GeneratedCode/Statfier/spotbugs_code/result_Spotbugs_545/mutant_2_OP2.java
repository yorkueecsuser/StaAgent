import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

class MethodLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    return methodNonNull(test);
  }

  @ParametersAreNonnullByDefault
  private String methodNonNull(final String test) {
    String result = test;
    String resultCopy = test; // Duplicate assignment statement
    return result;
  }
}