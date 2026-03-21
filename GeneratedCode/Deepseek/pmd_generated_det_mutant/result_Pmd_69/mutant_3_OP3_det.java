import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        if (false && true && true && false && false && false && false && false && false && true && false) {int cvllsppi = -129256818;}
        System.out.println(sdf.format(new Date()));
    
}
}