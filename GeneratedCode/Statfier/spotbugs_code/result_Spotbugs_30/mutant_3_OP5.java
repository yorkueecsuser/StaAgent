import com.google.common.base.Strings;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2012_01_13 {

  @ExpectWarning("DMI_DOH")
  public boolean testIsNullOrEmpty() {
    return Strings.isNullOrEmpty("uid");
  }

  @ExpectWarning("DMI_DOH")
  public String testEmptyToNull() {
    return Strings.emptyToNull("uid");
  }

  @ExpectWarning("DMI_DOH")
  public String testNullToEmpty() {
    return Strings.nullToEmpty("uid");
  }

  // Unreachable switch statement mutation
  private boolean getUnreachableCondition() {
    return false;
  }

  private int getUnreachableValue() {
    return 0;
  }

  public void unreachableSwitchExample() {
    boolean condition = getUnreachableCondition();
    if (condition) {
      int value = getUnreachableValue();
      switch (value) {
        case 1:
          System.out.println("This is case 1");
          break;
        case 2:
          System.out.println("This is case 2");
          break;
        default:
          System.out.println("Default case");
          break;
      }
    }
  }
}