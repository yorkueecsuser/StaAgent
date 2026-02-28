import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    // Adding a dead store variable
    int deadStoreVar = new Random().nextInt(100);
    return sdf.parse(dateStr);
  }
}