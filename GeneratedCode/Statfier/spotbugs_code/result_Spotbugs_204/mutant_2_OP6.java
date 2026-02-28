import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;

class Bug2843665 {

  @DesireNoWarning("UPM")
  private static void setLogLevel(String logLevel) {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  @DesireWarning("UPM")
  private static void neverCalled(String test) {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  public static void main() {
    setLogLevel("test");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}