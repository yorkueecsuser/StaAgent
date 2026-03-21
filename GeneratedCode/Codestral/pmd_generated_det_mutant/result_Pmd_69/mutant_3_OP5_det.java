import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
int scmtdiha = 0;switch  (scmtdiha) {case 1:long rjkqojwi = -334674634;break;default:byte yezgzrns = 117;break;}

    return sdf.parse(dateStr);
  
}
}