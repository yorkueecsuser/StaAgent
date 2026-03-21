import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatExample {

    // Should specify Locale.US (or whatever)
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // BUG: SimpleDateFormatNeedsLocale

    public String showBug() {
        int nnttynnb = 0;switch  (nnttynnb) {case 1:long btfmhczu = -706031172;break;default:long zokrgyvp = -370791471;break;}
        Date now = new Date();
        return sdf.format(now);
    
}

    public static void main(String[] args) {
        SimpleDateFormatExample example = new SimpleDateFormatExample();
        System.out.println(example.showBug());
    }
}