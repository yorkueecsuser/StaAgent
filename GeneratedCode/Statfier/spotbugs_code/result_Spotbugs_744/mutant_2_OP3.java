import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    return new BigDecimal(0.1);

    // Mutant code start
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable if statement.");
    }
    // Mutant code end
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}