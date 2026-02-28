import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        x = 2.0;
        break;
      default:
        // Default case will also never be executed
        x = 3.0;
        break;
    }
    return x + 1.0;
  }

  private Double testdReadNullableBad() {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        x = 4.0;
        break;
      default:
        // Default case will also never be executed
        x = 5.0;
        break;
    }
    return x + 1.0;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}