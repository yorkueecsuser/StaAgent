import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern");
    private boolean conditionFor = false; // Mutant: Unreachable for loop

    public void showBug() {
        System.out.println(sdf.format(new Date()));
        for (int i = 0; conditionFor; i++) { // Unreachable loop
            // Do nothing
        }
    }
}