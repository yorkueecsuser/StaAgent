import javax.annotation.Nullable;

class PackageLevel {
  public String method() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() will return false
    }
    return methodNullable(null);
  }

  private String methodNullable(@Nullable final String test) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() will return false
    }
    return methodNonNull(test);
  }

  private String methodNonNull(final String test) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() will return false
    }
    return test;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false
  }
}