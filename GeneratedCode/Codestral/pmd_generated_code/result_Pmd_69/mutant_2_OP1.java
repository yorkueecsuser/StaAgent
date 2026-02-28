import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    // Dead Store mutation
    int unusedVariable = 10;  // Randomly generated variable name and initialized with an integer value
    return sdf.parse(dateStr);
  }
}