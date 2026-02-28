import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatterExample {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public String showBug(Date date) {
        // This line demonstrates the bug where the static SimpleDateFormat instance is not synchronized
        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    }

    public String showCorrectUsage(Date date) {
        synchronized (sdf) {
            return sdf.format(date); // correct usage with synchronization
        }
    }
}