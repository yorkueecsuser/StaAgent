import com.google.common.base.Strings;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2012_01_13 {

  @ExpectWarning("DMI_DOH")
  public boolean testIsNullOrEmpty() {
    return Strings.isNullOrEmpty("uid");
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @ExpectWarning("DMI_DOH")
  public String testEmptyToNull() {
    return Strings.emptyToNull("uid");
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  @ExpectWarning("DMI_DOH")
  public String testNullToEmpty() {
    return Strings.nullToEmpty("uid");
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition for the if statements
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}