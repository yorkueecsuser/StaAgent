import java.text.SimpleDateFormat;
import java.util.Date;

class SimpleDateFormatBug {
    // BUG: SimpleDateFormatNeedsLocale
public static void main(String [] args){
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(format.format(date));
}
}