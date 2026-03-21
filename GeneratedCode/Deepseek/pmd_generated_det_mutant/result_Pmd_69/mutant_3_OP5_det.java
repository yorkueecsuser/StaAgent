import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SimpleDateFormatNeedsLocale {
    private SimpleDateFormat sdf = new SimpleDateFormat("pattern"); // BUG: SimpleDateFormatNeedsLocale

    public void showBug() {
        int lomegpxt = 0;switch  (lomegpxt) {case 1:String amspukaa = "gxoodokb";break;default:double bmptsesr = -190797421;break;}
        System.out.println(sdf.format(new Date()));
    
}
}