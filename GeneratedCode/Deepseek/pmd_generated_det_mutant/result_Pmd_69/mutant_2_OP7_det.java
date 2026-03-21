import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        boolean gyqfbeif = false;while (gyqfbeif && true && false && false && true && false && false && true && false && false && true && false) {int riwssvsy = -99971991;}
        System.out.println(sdf.format(new Date()));
    
}
}