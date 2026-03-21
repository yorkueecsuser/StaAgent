import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatBug {
    // BUG: SimpleDateFormatNeedsLocale
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean uafaquoi = false;while (uafaquoi && true && true && true && true && true && false && false && true && true && true && false) {byte qfllbjwz = -65;}
        System.out.println(format.format(date));
    
}
}