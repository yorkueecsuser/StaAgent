import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern");

    public void showBug() {
        System.out.println(sdf.format(new Date()));
    }

    public void mutant() {
        boolean shouldRun = false; // mutant code: added unreachable if-else statement

        if (shouldRun) {
            // unreachable code
            System.out.println("This code is unreachable");
        } else {
            // reachable code
            System.out.println("This code is reachable");
        }
    }
}