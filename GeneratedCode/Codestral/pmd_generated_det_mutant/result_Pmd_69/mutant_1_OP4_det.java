import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
if (false && true && true && true && true && true && false && false && true && true && false) {long ygcfhmuu = 724544458;}else{boolean nnvertic = false;}

    return sdf.parse(dateStr);
  
}
}