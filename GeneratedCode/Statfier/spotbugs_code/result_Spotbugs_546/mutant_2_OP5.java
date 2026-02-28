import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        return "Unreachable";
      default:
        break;
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