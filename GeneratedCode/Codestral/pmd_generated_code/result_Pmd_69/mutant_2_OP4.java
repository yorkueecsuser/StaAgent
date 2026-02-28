import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    if (getCondition()) {
      // This block will never be executed
      System.out.println("This block is unreachable.");
    } else {
      return sdf.parse(dateStr);
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}