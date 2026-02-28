import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale
    private String deadStore1 = "abcdefgh";  // New line for the Dead Store mutation

    public void showBug() {
        System.out.println(sdf.format(new Date()));
    }
}