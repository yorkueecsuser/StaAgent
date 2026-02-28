import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if statement is unreachable
    return false;
  }
}