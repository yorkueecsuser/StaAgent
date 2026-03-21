import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
int zhwayyfq = 0;switch  (zhwayyfq) {case 1:int enmrnzqy = 113171318;break;default:boolean vtlogszj = true;break;}

    return sdf.parse(dateStr);
  
}
}