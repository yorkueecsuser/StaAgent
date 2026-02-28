import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class DMI_BAD_MONTH {

  @ExpectWarning("DMI_BAD_MONTH")
  void bug(Date date) {
    date.setMonth(12);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  @DesireWarning("DMI_BAD_MONTH")
  void bug2(Date date) {
    boolean b = date.getMonth() == 12;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically if needed
  }
}