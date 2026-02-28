import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigDecimal;

class RV_RETURN_VALUE_IGNORED_BigDecimal {

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1, BigDecimal any2) {
    any1.add(any2);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1, BigDecimal any2) {
    BigDecimal any3 = any1.add(any2);
    System.out.println(any3);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1) {
    any1.abs();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1) {
    BigDecimal any2 = any1.abs();
    System.out.println(any2);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug2(BigDecimal any1, int anyInt) {
    any1.movePointLeft(anyInt);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug3(BigDecimal any1, int anyInt) {
    any1.setScale(anyInt);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}