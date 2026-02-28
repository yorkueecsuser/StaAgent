import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class DMI_BAD_MONTH {

  @ExpectWarning("DMI_BAD_MONTH")
  void bug(Date date) {
    date.setMonth(12);
    // Mutant: Duplicate the assignment statement
    date.setMonth(12);
  }

  @DesireWarning("DMI_BAD_MONTH")
  void bug2(Date date) {
    boolean b = date.getMonth() == 12;
    // Mutant: Introduce a unique duplicate assignment statement without method invocation
    int month = date.getMonth();
    int monthCopy = month;
  }
}