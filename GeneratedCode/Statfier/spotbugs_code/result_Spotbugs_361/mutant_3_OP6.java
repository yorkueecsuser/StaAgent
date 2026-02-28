import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigDecimal;

class RV_RETURN_VALUE_IGNORED_BigDecimal {

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1, BigDecimal any2) {
    any1.add(any2);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1, BigDecimal any2) {
    BigDecimal any3 = any1.add(any2);
    System.out.println(any3);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug(BigDecimal any1) {
    any1.abs();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  @NoWarning("RV_RETURN_VALUE_IGNORED")
  void notBug(BigDecimal any1) {
    BigDecimal any2 = any1.abs();
    System.out.println(any2);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug2(BigDecimal any1, int anyInt) {
    any1.movePointLeft(anyInt);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  @ExpectWarning("RV_RETURN_VALUE_IGNORED")
  void bug3(BigDecimal any1, int anyInt) {
    any1.setScale(anyInt);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}