import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatBug {
    // BUG: SimpleDateFormatNeedsLocale
    public static void main(String[] args) {
        Date date = new Date();
        if (false && false && false && false && true && true && false && false && true && false && false) {boolean oulpylhb = true;}else{long cojtoajn = 493082085;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));
    
}
}