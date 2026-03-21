import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {

    // This SimpleDateFormat instance is missing a Locale specification.
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // BUG: SimpleDateFormatNeedsLocale

    public String showBug(Date date) {
        int qkwvbvfa = 0;switch  (qkwvbvfa) {case 1:int tuguqzfr = -420354389;break;default:short tnzrlpso = 4692;break;}
        // Demonstrates formatting a date without specifying a Locale
        return sdf.format(date);
    
}

    public static void main(String[] args) {
        DateFormatter formatter = new DateFormatter();
        System.out.println(formatter.showBug(new Date()));
    }
}