import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      return "Unreachable";
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}