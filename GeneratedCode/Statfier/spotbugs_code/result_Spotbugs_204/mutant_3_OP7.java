import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;

class Bug2843665 {

  @DesireNoWarning("UPM")
  private static void setLogLevel(String logLevel) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @DesireWarning("UPM")
  private static void neverCalled(String test) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public static void main() {
    setLogLevel("test");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private static boolean getCondition() {
    return false;
  }
}