import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    return new BigDecimal(0.1);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This is always printed");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition always 1
    return false;
  }
}