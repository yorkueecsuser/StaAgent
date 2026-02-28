import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale
    private boolean conditionWhile = true; // Mutation Operator: Inserting unreachable while loop

    public void showBug() {
        System.out.println(sdf.format(new Date()));
        while (conditionWhile) { // Mutation Operator: Inserting unreachable while loop
            // Empty loop body
        }
    }
}