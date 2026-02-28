import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class DMI_BAD_MONTH {

  @ExpectWarning("DMI_BAD_MONTH")
  void bug(Date date) {
    date.setMonth(12);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This block is reachable");
    } else {
      // This block is unreachable
      date.setMonth(11); // Unique mutant code
    }
  }

  @DesireWarning("DMI_BAD_MONTH")
  void bug2(Date date) {
    boolean b = date.getMonth() == 12;

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This block is reachable");
    } else {
      // This block is unreachable
      boolean c = date.getMonth() == 11; // Unique mutant code
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // Always returns true to ensure the if block is reachable
  }
}