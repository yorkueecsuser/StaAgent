import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;

class Bug2843665 {

  @DesireNoWarning("UPM")
  private static void setLogLevel(String logLevel) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
    }
  }

  @DesireWarning("UPM")
  private static void neverCalled(String test) {}

  public static void main() {
    setLogLevel("test");
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}