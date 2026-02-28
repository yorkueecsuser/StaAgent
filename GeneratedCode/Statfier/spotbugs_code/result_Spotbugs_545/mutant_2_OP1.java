import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

class MethodLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    // Dead store mutation
    String qzjxvbnr = "unused";
    return methodNonNull(test);
  }

  @ParametersAreNonnullByDefault
  private String methodNonNull(final String test) {
    return test;
  }
}