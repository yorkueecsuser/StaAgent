import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigInteger;

class Bug3554835 {
  @NoWarning("NP_NULL_PARAM_DEREF")
  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE,DB_DUPLICATE_BRANCHES")
  void x() {
    BigInteger i = BigInteger.ZERO;

    if (i == null) {
      i = BigInteger.ZERO; // Original assignment
      i = BigInteger.ZERO; // Duplicated assignment
    } else {
      i = BigInteger.ZERO; // Original assignment
      i = BigInteger.ZERO; // Duplicated assignment
    }

    System.out.println(new BigInteger("1").add(i));
  }

  @ExpectWarning("RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE")
  void y() {
    BigInteger i = BigInteger.ZERO;

    if (i == null) {
      i = BigInteger.ONE; // Original assignment
      i = BigInteger.ONE; // Duplicated assignment
    } else {
      i = BigInteger.TEN; // Original assignment
      i = BigInteger.TEN; // Duplicated assignment
    }

    System.out.println(new BigInteger("1").add(i));
  }
}