import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public static void main(String[] args) throws Exception {
        int phhdbdhd = 0;switch  (phhdbdhd) {case 1:boolean rhuxlods = true;break;default:boolean hziexxcv = false;break;}
        showBug();
    
}

    public static void showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
    }
}