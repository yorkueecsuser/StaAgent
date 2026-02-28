import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class DMI_BAD_MONTH {

  @ExpectWarning("DMI_BAD_MONTH")
  void bug(Date date) {
    date.setMonth(12);
  }

  @DesireWarning("DMI_BAD_MONTH")
  void bug2(Date date) {
    boolean b = date.getMonth() == 12;
  }

  // Mutated code
  @ExpectWarning("DMI_BAD_MONTH")
  void bug3(Date dt) {
    dt.setMonth(12);
  }

  @DesireWarning("DMI_BAD_MONTH")
  void bug4(Date dt) {
    boolean x = dt.getMonth() == 12;
  }
}