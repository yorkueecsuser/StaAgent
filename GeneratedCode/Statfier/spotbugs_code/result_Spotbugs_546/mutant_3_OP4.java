import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      return "Unreachable Code";
    } else {
      // This block will also never execute because getCondition() returns false
      return "Another Unreachable Code";
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}