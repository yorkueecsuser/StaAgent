import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is never true
        return "Unreachable Case";
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false;
  }
}