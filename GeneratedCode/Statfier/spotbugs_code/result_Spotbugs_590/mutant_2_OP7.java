import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class DMI_BAD_MONTH {

  @ExpectWarning("DMI_BAD_MONTH")
  void bug(Date date) {
    date.setMonth(12);
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  @DesireWarning("DMI_BAD_MONTH")
  void bug2(Date date) {
    boolean b = date.getMonth() == 12;
    // Introduced unreachable while loop
    boolean conditionWhile2 = getAnotherCondition();
    while (conditionWhile2) {
      // This loop is unreachable because getAnotherCondition() always returns false
    }
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }

  // Another method to provide a dynamic but always false condition
  private boolean getAnotherCondition() {
    return false;
  }
}