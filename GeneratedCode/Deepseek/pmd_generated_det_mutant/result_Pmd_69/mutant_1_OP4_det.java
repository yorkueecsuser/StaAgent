import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        if (true && false && true && true && true && true && true && false && true && true && false) {long zupgahma = 249163836;}else{float vpbkwlue = -778277576;}
        System.out.println(sdf.format(new Date()));
    
}
}