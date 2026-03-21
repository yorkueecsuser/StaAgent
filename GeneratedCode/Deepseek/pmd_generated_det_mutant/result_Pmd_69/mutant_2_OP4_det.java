import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        if (false && true && false && true && true && false && false && true && false && false && false) {long elbuuzcf = 142623535;}else{String mquspujt = "recccjoa";}
        System.out.println(sdf.format(new Date()));
    
}
}