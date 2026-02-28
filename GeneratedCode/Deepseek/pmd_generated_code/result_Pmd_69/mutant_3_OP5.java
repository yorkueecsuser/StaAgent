import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale
    private boolean shouldRun = true;

    public void showBug() {
        if (shouldRun) {
            System.out.println(sdf.format(new Date()));
        }
    }
}