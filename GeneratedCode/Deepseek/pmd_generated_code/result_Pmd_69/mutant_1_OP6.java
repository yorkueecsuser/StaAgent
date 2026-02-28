import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf; // MUTATED: SimpleDateFormatNeedsLocale

    public void showBug() {
        // MUTATED: Unreachable for loop
        boolean unreachable = false;
        for (; unreachable; ) {
            System.out.println("Unreachable code");
        }
        // END MUTATED

        sdf = new SimpleDateFormat("pattern");
        System.out.println(sdf.format(new Date()));
    }
}