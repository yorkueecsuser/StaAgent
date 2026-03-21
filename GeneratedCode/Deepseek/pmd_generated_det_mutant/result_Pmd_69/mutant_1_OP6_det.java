import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        for  (int ugbcbylo = 0; ugbcbylo < 0; ugbcbylo++) {int vdtjrzgd = 154336425;}
        System.out.println(sdf.format(new Date()));
    
}
}