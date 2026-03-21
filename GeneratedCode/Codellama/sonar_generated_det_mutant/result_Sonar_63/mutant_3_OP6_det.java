import java.text.SimpleDateFormat;
import java.util.Date;

class BuggyDateFormat {

    public static void main(String[] args) {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        for  (int ztdpdbvc = 0; ztdpdbvc < 0; ztdpdbvc++) {float xeichahj = 544683548;}
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
    
}
}