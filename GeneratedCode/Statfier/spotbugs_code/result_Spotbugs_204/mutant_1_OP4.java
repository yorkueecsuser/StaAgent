import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;

class Bug2843665 {

  @DesireNoWarning("UPM")
  private static void setLogLevel(String logLevel) {}

  @DesireWarning("UPM")
  private static void neverCalled(String test) {}

  public static void main() {
    setLogLevel("test");

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed because condition is always false.");
    } else {
      System.out.println("This will also never be printed because condition is always false.");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}