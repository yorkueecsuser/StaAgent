import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat bdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        System.out.println(bdf.format(new Date()));
    }
}