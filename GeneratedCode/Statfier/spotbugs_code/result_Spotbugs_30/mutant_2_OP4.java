import com.google.common.base.Strings;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2012_01_13 {

  @ExpectWarning("DMI_DOH")
  public boolean testIsNullOrEmpty() {
    return Strings.isNullOrEmpty("uid");
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("DMI_DOH")
  public String testEmptyToNull() {
    return Strings.emptyToNull("uid");
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  @ExpectWarning("DMI_DOH")
  public String testNullToEmpty() {
    return Strings.nullToEmpty("uid");
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}