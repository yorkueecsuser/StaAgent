import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }

    return new BigDecimal(0.1);
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and always false
    return false;
  }
}