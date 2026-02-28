import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    return new BigDecimal(0.1);
    
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}