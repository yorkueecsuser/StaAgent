import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    BigDecimal result = new BigDecimal(0.1);
    BigDecimal resultCopy = new BigDecimal(0.1); // Duplicate assignment statement
    return result;
  }
}