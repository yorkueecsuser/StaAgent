import javax.annotation.Nullable;

class DoubleExample {

  @Nullable Double x;

  private Double testAssignNonNullOk() {
    x = 1.0;
    return x + 1.0;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x = 2.0;
        break;
      case 1:
        // This case is also unreachable because condition is never false
        x = 3.0;
        break;
    }
  }

  private Double testdReadNullableBad() {
    return x + 1.0;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x = 4.0;
        break;
      case 1:
        // This case is also unreachable because condition is never false
        x = 5.0;
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}