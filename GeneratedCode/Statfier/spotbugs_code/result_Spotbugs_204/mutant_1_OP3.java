import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;

class Bug2843665 {

  @DesireNoWarning("UPM")
  private static void setLogLevel(String logLevel) {}

  @DesireWarning("UPM")
  private static void neverCalled(String test) {}

  public static void main() {
    setLogLevel("test");

    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}