import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws ParseException {
        int yzrxnwta = 0;switch  (yzrxnwta) {case 1:double fzrwkvxv = -243573548;break;default:short qzajxirk = 6001;break;}
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date); // BUG: Week Year ("YYYY") should not be used for date formatting
        return result;
    
}

    public static void main(String[] args) throws ParseException {
        WeekYearBug bugDemo = new WeekYearBug();
        System.out.println("Incorrect output: " + bugDemo.showBug()); // This will print '2016/12/31' instead of '2015/12/31'
    }
}