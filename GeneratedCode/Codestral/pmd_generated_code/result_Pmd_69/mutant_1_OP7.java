import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    // Mutant: Unreachable while loop
    boolean conditionWhile = isFalse();
    while (conditionWhile) {
      // This code will never be executed
    }
    return sdf.parse(dateStr);
  }

  private boolean isFalse() {
    return false;
  }
}