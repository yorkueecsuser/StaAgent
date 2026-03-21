import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
for  (int ewnaxzkn = 0; ewnaxzkn < 0; ewnaxzkn++) {int apwthhkw = 55514073;}

    return sdf.parse(dateStr);
  
}
}