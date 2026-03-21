import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
int lnznnkpj = 0;switch  (lnznnkpj) {case 1:byte btnatigr = -37;break;default:boolean twfoydxf = true;break;}

        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    
}

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
    }
}