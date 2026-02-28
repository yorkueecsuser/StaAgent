import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x + 1.0;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}