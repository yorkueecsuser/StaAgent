import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
int ywrmzycp = 0;switch  (ywrmzycp) {case 1:char lmnhtllc = 'b';break;default:byte cunljpeb = -7;break;}

        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    
}

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
    }
}