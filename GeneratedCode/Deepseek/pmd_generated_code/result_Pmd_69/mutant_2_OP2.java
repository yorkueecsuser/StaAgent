import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern");

    public void showBug() {
        System.out.println(sdf.format(new Date()));
    }

    public void duplicationMutant() {
        // Duplication mutant code starts here
        SimpleDateFormat sdfDuplicationMutant = new SimpleDateFormat("pattern");
        // End of duplication mutant code
    }
}