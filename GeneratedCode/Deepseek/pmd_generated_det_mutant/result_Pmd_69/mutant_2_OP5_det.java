import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        int zncevgtw = 0;switch  (zncevgtw) {case 1:float myaffimf = 90665381;break;default:long hkyyofyh = -702828445;break;}
        System.out.println(sdf.format(new Date()));
    
}
}