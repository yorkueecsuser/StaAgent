import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
for  (int jtrhlejy = 0; jtrhlejy < 0; jtrhlejy++) {String livattui = "ggytodju";}

    return sdf.parse(dateStr);
  
}
}