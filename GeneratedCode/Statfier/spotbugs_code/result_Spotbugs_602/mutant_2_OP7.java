import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigInteger;

class Bug3554835 {
  @NoWarning("NP_NULL_PARAM_DEREF")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE,DB_DUPLICATE_BRANCHES")
  void x() {
    BigInteger i = BigInteger.ZERO;

    // Inserting unreachable while loop
    boolean conditionWhileX = getCondition();
    while (conditionWhileX) {
      // Unreachable code
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

    // Inserting unreachable while loop
    boolean conditionWhileY = getCondition();
    while (conditionWhileY) {
      // Unreachable code
      i = BigInteger.TEN;
    }

    if (i == null) {
      i = BigInteger.ONE;
    } else {
      i = BigInteger.TEN;
    }

    System.out.println(new BigInteger("1").add(i));
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will ensure the loop is unreachable at runtime
  }
}