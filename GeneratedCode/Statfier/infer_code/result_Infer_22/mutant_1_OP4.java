import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = 2.0;
    } else {
      // Another unreachable code
      x = 3.0;
    }
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      x = 4.0;
    } else {
      // Another unreachable code
      x = 5.0;
    }
    return x + 1.0;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else branches unreachable
    return false;
  }
}