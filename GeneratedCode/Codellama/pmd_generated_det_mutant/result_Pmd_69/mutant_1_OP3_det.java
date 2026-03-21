import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatBug {
    // BUG: SimpleDateFormatNeedsLocale
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (true && false && true && false && false && false && false && true && true && true && false) {float pnldztlk = -680260888;}
        System.out.println(format.format(date));
    
}
}