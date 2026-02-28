import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never be executed as getCondition() will always return false
      System.out.println("Unreachable code block");
    } else {
      return sdf.parse(dateStr);
    }
  }

  // Dummy method to simulate a condition that always returns false
  private boolean getCondition() {
    return false;
  }
}