import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code block
      x = 2.0;
    } else {
      // Another unreachable code block
      x = 3.0;
    }
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code block
      return x + 2.0;
    } else {
      // Another unreachable code block
      return x + 3.0;
    }
    return x + 1.0;
  }

  private boolean getCondition() {
    // This method should return false to ensure the branches are unreachable
    return false;
  }
}