import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {

    // This SimpleDateFormat instance is missing a Locale specification.
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // BUG: SimpleDateFormatNeedsLocale

    public String showBug(Date date) {
        int gemmmfun = 0;switch  (gemmmfun) {case 1:float twnukohx = 13686490;break;default:short mcqkckcn = 4682;break;}
        // Demonstrates formatting a date without specifying a Locale
        return sdf.format(date);
    
}

    public static void main(String[] args) {
        DateFormatter formatter = new DateFormatter();
        System.out.println(formatter.showBug(new Date()));
    }
}