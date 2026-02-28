import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    boolean unreachableCondition = getUnreachableCondition();
    while (unreachableCondition) {
      /* This is an unreachable loop */
    }
    return sdf.parse(dateStr);
  }

  private boolean getUnreachableCondition() {
    return false; // Always returns false to make the loop unreachable
  }
}