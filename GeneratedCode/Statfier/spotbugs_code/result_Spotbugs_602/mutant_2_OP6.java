import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigInteger;

class Bug3554835 {
  @NoWarning("NP_NULL_PARAM_DEREF")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE,DB_DUPLICATE_BRANCHES")
  void x() {
    BigInteger i = BigInteger.ZERO;

    // Introduced an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
      i = BigInteger.ONE;
    }

    if (i == null) {
      i = BigInteger.ZERO;
    } else {
      i = BigInteger.ZERO;
    }

    System.out.println(new BigInteger("1").add(i));
  }

  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE")
  void y() {
    BigInteger i = BigInteger.ZERO;

    // Introduced an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
      i = BigInteger.ONE;
    }

    if (i == null) {
      i = BigInteger.ONE;
    } else {
      i = BigInteger.TEN;
    }

    System.out.println(new BigInteger("1").add(i));
  }

  // Method to provide a dynamic condition that evaluates to false
  private boolean getCondition() {
    return false;
  }
}