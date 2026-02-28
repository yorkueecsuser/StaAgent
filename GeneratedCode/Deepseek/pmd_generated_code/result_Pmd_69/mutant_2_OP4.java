import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern", Locale.US);
    private boolean condition = true; // Mutation: add a constant condition that is always true

    public void showBug() {
        if (condition) { // Mutation: add an if statement that always executes the following line of code
            System.out.println(sdf.format(new Date()));
        } else { // Mutation: add an unreachable else branch to the if statement
            System.out.println("Unreachable code");
        }
    }
}