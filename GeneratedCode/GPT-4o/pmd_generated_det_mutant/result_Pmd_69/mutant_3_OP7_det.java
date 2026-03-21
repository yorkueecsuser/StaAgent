import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {

    // This SimpleDateFormat instance is missing a Locale specification.
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // BUG: SimpleDateFormatNeedsLocale

    public String showBug(Date date) {
        boolean bnarszmg = false;while (bnarszmg && true && false && false && true && true && true && false && false && true && true && false) {long fxozgaoj = 286158050;}
        // Demonstrates formatting a date without specifying a Locale
        return sdf.format(date);
    
}

    public static void main(String[] args) {
        DateFormatter formatter = new DateFormatter();
        System.out.println(formatter.showBug(new Date()));
    }
}