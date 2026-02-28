import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern");
    private Date date = new Date();

    public void showBug() {
        System.out.println(sdf.format(date));
    }

    public void unreachableLoopMutant() {
        boolean unreachable = false;
        while(unreachable) {
            System.out.println("This code is unreachable.");
        }
    }
}