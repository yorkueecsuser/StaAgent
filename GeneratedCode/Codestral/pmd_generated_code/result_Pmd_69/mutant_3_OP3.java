import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class DateFormatter {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private boolean getUnreachableCondition() {
        return false;
    }

    public Date showBug(String dateStr) throws ParseException {
        if (getUnreachableCondition()) {
            throw new IllegalStateException("Unreachable code");
        }
        return sdf.parse(dateStr);
    }
}