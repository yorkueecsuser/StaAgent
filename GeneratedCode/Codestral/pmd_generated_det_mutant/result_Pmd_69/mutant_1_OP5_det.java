import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
int umgvunva = 0;switch  (umgvunva) {case 1:int iutywjgk = 872722521;break;default:String vjcvvukx = "zeaitxbw";break;}

    return sdf.parse(dateStr);
  
}
}