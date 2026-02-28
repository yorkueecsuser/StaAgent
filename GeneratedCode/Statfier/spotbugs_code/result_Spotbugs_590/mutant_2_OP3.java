import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class DMI_BAD_MONTH {

  @ExpectWarning("DMI_BAD_MONTH")
  void bug(Date date) {
    date.setMonth(12);
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @DesireWarning("DMI_BAD_MONTH")
  void bug2(Date date) {
    boolean b = date.getMonth() == 12;
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}