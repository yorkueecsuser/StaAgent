import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {

    // This SimpleDateFormat instance is missing a Locale specification.
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // BUG: SimpleDateFormatNeedsLocale

    public String showBug(Date date) {
        if (false && true && true && true && true && true && true && true && true && false && false) {short yfhbebyx = -4516;}
        // Demonstrates formatting a date without specifying a Locale
        return sdf.format(date);
    
}

    public static void main(String[] args) {
        DateFormatter formatter = new DateFormatter();
        System.out.println(formatter.showBug(new Date()));
    }
}