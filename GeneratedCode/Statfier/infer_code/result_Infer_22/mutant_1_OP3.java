import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 2.0;
    }
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 0.0;
    }
    return x + 1.0;
  }

  private boolean getCondition() {
    // This method returns false, making the if block unreachable
    return false;
  }
}