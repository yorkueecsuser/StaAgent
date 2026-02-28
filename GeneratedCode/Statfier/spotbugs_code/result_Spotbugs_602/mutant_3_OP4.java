import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigInteger;

class Bug3554835 {
  @NoWarning("NP_NULL_PARAM_DEREF")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE,DB_DUPLICATE_BRANCHES")
  void x() {
    BigInteger i = BigInteger.ZERO;

    if (i == null) {
      i = BigInteger.ZERO;
    } else {
      i = BigInteger.ZERO;
    }

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      i = BigInteger.valueOf(5); // This branch is unreachable because getCondition() will return false
    } else {
      i = BigInteger.valueOf(7); // This branch is also unreachable because getCondition() will return false
    }

    System.out.println(new BigInteger("1").add(i));
  }

  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE")
  void y() {
    BigInteger i = BigInteger.ZERO;

    if (i == null) {
      i = BigInteger.ONE;
    } else {
      i = BigInteger.TEN;
    }

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      i = BigInteger.valueOf(15); // This branch is unreachable because getCondition() will return false
    } else {
      i = BigInteger.valueOf(20); // This branch is also unreachable because getCondition() will return false
    }

    System.out.println(new BigInteger("1").add(i));
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}