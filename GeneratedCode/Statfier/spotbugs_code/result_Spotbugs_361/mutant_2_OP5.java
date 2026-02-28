import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigDecimal;

class RV_RETURN_VALUE_IGNORED_BigDecimal {

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1, BigDecimal any2) {
    any1.add(any2);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is reachable
        System.out.println("Reachable case 1");
        break;
    }
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1, BigDecimal any2) {
    BigDecimal any3 = any1.add(any2);
    System.out.println(any3);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1) {
    any1.abs();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is reachable
        System.out.println("Reachable case 1");
        break;
    }
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1) {
    BigDecimal any2 = any1.abs();
    System.out.println(any2);
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug2(BigDecimal any1, int anyInt) {
    any1.movePointLeft(anyInt);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is reachable
        System.out.println("Reachable case 1");
        break;
    }
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug3(BigDecimal any1, int anyInt) {
    any1.setScale(anyInt);
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is reachable
        System.out.println("Reachable case 1");
        break;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}