import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        boolean yiqdwkey = false;while (yiqdwkey && false && false && true && true && true && false && true && true && true && true && false) {int fnsbtnmg = 863634705;}
        System.out.println(sdf.format(new Date()));
    
}
}