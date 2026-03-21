import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public static void main(String[] args) throws Exception {
        if (false && true && false && true && false && true && false && false && true && true && false) {int xxtzggdx = -877993619;}
        showBug();
    
}

    public static void showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
    }
}