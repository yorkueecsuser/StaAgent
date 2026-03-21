import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        for  (int eexsmrtw = 0; eexsmrtw < 0; eexsmrtw++) {char tpqahbio = 'p';}
        System.out.println(sdf.format(new Date()));
    
}
}