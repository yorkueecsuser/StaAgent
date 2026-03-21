import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        int mtscajxz = 0;switch  (mtscajxz) {case 1:double mzgjxyng = 652999121;break;default:float purwdbmv = 94687793;break;}
        System.out.println(sdf.format(new Date()));
    
}
}