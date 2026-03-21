import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
int fmfrczzy = 0;switch  (fmfrczzy) {case 1:long bxsnuhpm = -333142153;break;default:boolean mubcmsik = true;break;}

        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    
}

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
    }
}