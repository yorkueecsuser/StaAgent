import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public static void main(String[] args) throws Exception {
        int ghusxyfh = 0;switch  (ghusxyfh) {case 1:String sqaajikd = "hnfdfrfj";break;default:float xagywmmq = 85876491;break;}
        showBug();
    
}

    public static void showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
    }
}