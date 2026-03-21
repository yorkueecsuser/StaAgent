import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        if (true && true && true && false && false && false && false && true && true && false && false) {int meqgmrhe = -405409971;}else{double wzvwomst = -255769920;}
        System.out.println(sdf.format(new Date()));
    
}
}