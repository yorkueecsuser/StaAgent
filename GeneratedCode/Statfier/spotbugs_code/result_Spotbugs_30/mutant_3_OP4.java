import com.google.common.base.Strings;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2012_01_13 {

  @ExpectWarning("DMI_DOH")
  public boolean testIsNullOrEmpty() {
    return Strings.isNullOrEmpty("uid");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  @ExpectWarning("DMI_DOH")
  public String testEmptyToNull() {
    return Strings.emptyToNull("uid");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return "Unreachable";
    } else {
      return "Also unreachable";
    }
  }

  @ExpectWarning("DMI_DOH")
  public String testNullToEmpty() {
    return Strings.nullToEmpty("uid");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return "Unreachable";
    } else {
      return "Also unreachable";
    }
  }

  // Method to provide a dynamic condition for the if-else statements
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}