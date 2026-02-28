import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return "Unreachable";
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  private boolean getCondition() {
    // This method ensures that the condition is never true at runtime
    return false;
  }
}