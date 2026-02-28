import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
    // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Date showBug(String dateStr) throws ParseException {
        // Adding unreachable for loop
        for (int i = 0; isAlwaysFalse(); i++) {
            // This code will never execute
            System.out.println("This is an unreachable statement");
        }
        return sdf.parse(dateStr);
    }

    private boolean isAlwaysFalse() {
        return false;
    }
}