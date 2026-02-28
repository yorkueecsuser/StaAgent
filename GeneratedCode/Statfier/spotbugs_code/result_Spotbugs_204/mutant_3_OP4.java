import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;

class Bug2843665 {

  @DesireNoWarning("UPM")
  private static void setLogLevel(String logLevel) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that might run
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch.");
    }
  }

  @DesireWarning("UPM")
  private static void neverCalled(String test) {}

  public static void main() {
    setLogLevel("test");
  }

  private static boolean getCondition() {
    return false; // This ensures the else branch is theoretically unreachable
  }
}