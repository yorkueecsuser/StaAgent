import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;

class Bug2843665 {

  @DesireNoWarning("UPM")
  private static void setLogLevel(String logLevel) {
    // Dead Store Mutation
    String qwejklmn = "unusedVariable";
  }

  @DesireWarning("UPM")
  private static void neverCalled(String test) {}

  public static void main() {
    setLogLevel("test");
    // Dead Store Mutation
    int abcdefgh = 42;
  }
}