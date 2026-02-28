import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale
    private String unusedVariable = "abcdefgh"; // Dead Store Mutant

    public void showBug() {
        System.out.println(sdf.format(new Date()));
    }
}