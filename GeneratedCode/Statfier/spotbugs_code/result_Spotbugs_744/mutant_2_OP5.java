import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    return new BigDecimal(0.1);

    // Introduced unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}