import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    return x + 1.0;

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        x = 2.0;
        break;
      case 1:
        // This case will always be executed
        x = 3.0;
        break;
    }
  }

  private Double testdReadNullableBad() {
    return x + 1.0;

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        x = 2.0;
        break;
      case 1:
        // This case will always be executed
        x = 3.0;
        break;
    }
  }

  private boolean getCondition() {
    // This method returns false, making the switch statement unreachable
    return false;
  }
}