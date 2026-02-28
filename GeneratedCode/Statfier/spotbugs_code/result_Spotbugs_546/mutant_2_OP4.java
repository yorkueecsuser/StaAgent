import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block");
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    return test;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if-else block is unreachable
    return false;
  }
}