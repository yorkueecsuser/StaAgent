import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatBug {
    // BUG: SimpleDateFormatNeedsLocale
    public static void main(String[] args) {
        if (true && false && true && true && false && false && true && false && true && true && false) {short aadwmhgd = -1662;}
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));
    
}
}