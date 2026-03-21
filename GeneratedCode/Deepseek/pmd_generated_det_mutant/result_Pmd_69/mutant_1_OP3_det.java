import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        if (true && false && false && false && false && false && true && true && true && true && false) {int sxgrhfaw = 217912148;}
        System.out.println(sdf.format(new Date()));
    
}
}