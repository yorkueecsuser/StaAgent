import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class DMI_BAD_MONTH {

  @ExpectWarning("DMI_BAD_MONTH")
  void bug(Date date) {
    date.setMonth(12);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  @DesireWarning("DMI_BAD_MONTH")
  void bug2(Date date) {
    boolean b = date.getMonth() == 12;

    // Inserting unreachable for loop
    boolean conditionFor2 = getCondition2();
    for (int i = 0; conditionFor2; i++) {
      // This loop is unreachable because conditionFor2 is always false
    }
  }

  private boolean getCondition() {
    return false;
  }

  private boolean getCondition2() {
    return false;
  }
}