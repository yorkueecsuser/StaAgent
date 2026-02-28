import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat renamedSdf = new SimpleDateFormat("pattern"); // Mutated SimpleDateFormatNeedsLocale

    public void showBug() {
        System.out.println(renamedSdf.format(new Date()));
    }
}