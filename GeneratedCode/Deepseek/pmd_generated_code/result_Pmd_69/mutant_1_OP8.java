import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale
    private SimpleDateFormat sdf2 = new SimpleDateFormat("pattern", Locale.US); // MUTANT: Renaming

    public void showBug() {
        System.out.println(sdf.format(new Date()));
    }

    public void showMutant() { // Added to avoid unreachable statement error
        System.out.println(sdf2.format(new Date()));
    }
}