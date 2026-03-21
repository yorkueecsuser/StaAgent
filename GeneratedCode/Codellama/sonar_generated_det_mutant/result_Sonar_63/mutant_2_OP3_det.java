import java.text.SimpleDateFormat;
import java.util.Date;

class BuggyDateFormat {

    public static void main(String[] args) {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        if (true && false && false && false && false && true && true && true && true && true && false) {short xzrdnhfc = -3222;}
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
    
}
}