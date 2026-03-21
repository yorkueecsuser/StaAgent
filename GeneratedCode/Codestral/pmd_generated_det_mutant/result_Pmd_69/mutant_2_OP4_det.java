import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
if (false && false && false && false && true && false && true && true && false && false && false) {byte mlcimhax = 81;}else{short ndjgkiwn = -8526;}

    return sdf.parse(dateStr);
  
}
}