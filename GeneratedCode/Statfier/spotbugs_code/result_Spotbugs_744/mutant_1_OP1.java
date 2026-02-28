import java.math.BigDecimal;

class Ideas_2013_10_31 {

  BigDecimal getPointOne() {
    return new BigDecimal(0.1);
    // Dead Store Mutation
    String qwertyui = "unusedVariable";
  }
}