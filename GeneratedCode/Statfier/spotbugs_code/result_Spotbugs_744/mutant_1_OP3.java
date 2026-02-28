import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    return new BigDecimal(0.1);

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }
}