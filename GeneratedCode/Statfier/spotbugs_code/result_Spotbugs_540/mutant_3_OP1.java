import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class ClassLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    // Dead Store Mutation
    String qzjfnxrt = "unusedVariable";
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }
}