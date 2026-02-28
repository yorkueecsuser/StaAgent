import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    return new BigDecimal(0.1);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}