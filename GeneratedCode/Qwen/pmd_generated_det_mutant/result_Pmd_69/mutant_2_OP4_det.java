import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatExample {

    // Should specify Locale.US (or whatever)
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // BUG: SimpleDateFormatNeedsLocale

    public String showBug() {
        if (true && true && false && true && false && true && true && false && true && false && false) {byte lzmpgysr = -99;}else{float iclmmjdf = 111454023;}
        Date now = new Date();
        return sdf.format(now);
    
}

    public static void main(String[] args) {
        SimpleDateFormatExample example = new SimpleDateFormatExample();
        System.out.println(example.showBug());
    }
}