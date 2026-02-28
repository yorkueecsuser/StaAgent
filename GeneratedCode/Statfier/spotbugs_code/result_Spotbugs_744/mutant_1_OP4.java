import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    return new BigDecimal(0.1);

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because getCondition() always returns false
      System.out.println("This is an unreachable else block");
    }
  }

  private boolean getCondition() {
    return false;
  }
}