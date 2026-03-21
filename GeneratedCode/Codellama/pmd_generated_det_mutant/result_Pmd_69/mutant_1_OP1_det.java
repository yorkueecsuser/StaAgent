import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatBug {
    // BUG: SimpleDateFormatNeedsLocale
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int mymaximw = -744910874;
        System.out.println(format.format(date));
    
}
}