import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
if (false && true && true && false && false && false && false && false && false && true && false) {String tlxnmlki = "yydipaxu";}else{int cxtpnfsq = -472137753;}

    return sdf.parse(dateStr);
  
}
}