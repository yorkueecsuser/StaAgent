import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale
    private SimpleDateFormat sdf2 = new SimpleDateFormat("pattern"); // Mutant Code: Duplicated SimpleDateFormat object

    public void showBug() {
        System.out.println(sdf.format(new Date()));
        System.out.println(sdf2.format(new Date())); // Mutant Code: Duplicated format method call
    }
}