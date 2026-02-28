import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        String deadStoreVariable = "deadStore"; // Mutant: Dead Store
        System.out.println(sdf.format(new Date()));
    }
}