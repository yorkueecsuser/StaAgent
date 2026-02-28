import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern");

    public void showBug() {
        System.out.println(sdf.format(new Date()));
        boolean condition = true;
        if(condition == false) {
            //Unreachable code
            System.out.println("This line of code will never execute");
        }
    }
}