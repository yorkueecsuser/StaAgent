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

  // Mutant code with an unreachable if statement
  public void mutantMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This is reachable.");
    } else {
      // This block is unreachable because getCondition() always returns false
      if (condition) {
        System.out.println("This is unreachable.");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}