import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatBug {
    // BUG: SimpleDateFormatNeedsLocale
    public static void main(String[] args) {
        Date date = new Date();
        for  (int ikiluxhm = 0; ikiluxhm < 0; ikiluxhm++) {double dkdfhjwh = -551121662;}
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));
    
}
}