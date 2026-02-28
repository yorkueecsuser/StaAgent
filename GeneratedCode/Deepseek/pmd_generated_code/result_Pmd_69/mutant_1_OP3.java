import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern");
    private boolean condition;

    public void showBug() {
        if (false) {
            System.out.println(sdf.format(new Date()));
        }
        System.out.println("This is a dummy statement that ensures the if condition is not always false");
    }
}