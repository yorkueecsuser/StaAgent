import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigDecimal;

class RV_RETURN_VALUE_IGNORED_BigDecimal {

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1, BigDecimal any2) {
    any1.add(any2);
    String qzjxvbfn = "unusedVariable"; // Dead store mutation
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1, BigDecimal any2) {
    BigDecimal any3 = any1.add(any2);
    System.out.println(any3);
    int klmnopqr = 42; // Dead store mutation
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1) {
    any1.abs();
    double wxyzabcd = 3.14; // Dead store mutation
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1) {
    BigDecimal any2 = any1.abs();
    System.out.println(any2);
    boolean rstuvwxy = true; // Dead store mutation
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug2(BigDecimal any1, int anyInt) {
    any1.movePointLeft(anyInt);
    char mnopqrst = 'a'; // Dead store mutation
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug3(BigDecimal any1, int anyInt) {
    any1.setScale(anyInt);
    long abcdefgh = 100L; // Dead store mutation
  }
}