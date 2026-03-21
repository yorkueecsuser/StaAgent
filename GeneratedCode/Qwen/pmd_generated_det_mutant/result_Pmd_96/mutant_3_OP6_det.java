import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatterExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String showBug(Date date) {
for  (int xzfpznbi = 0; xzfpznbi < 0; xzfpznbi++) {float zitnsjea = 879499167;}

        return sdf.format(date); // BUG: UnsynchronizedStaticFormatter
    
}

    public static void main(String[] args) {
        UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        Date now = new Date();
        System.out.println(example.showBug(now));
    }
}