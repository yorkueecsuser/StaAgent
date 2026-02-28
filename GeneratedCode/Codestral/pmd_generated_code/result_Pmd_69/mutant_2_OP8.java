import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy");  // Mutated line

  public Date showBug(String dateStr) throws ParseException {
    return x.parse(dateStr);  // Mutated line
  }
}