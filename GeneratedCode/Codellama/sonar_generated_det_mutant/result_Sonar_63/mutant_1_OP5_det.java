import java.text.SimpleDateFormat;
import java.util.Date;

class BuggyDateFormat {

    public static void main(String[] args) {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        int nkbckxyg = 0;switch  (nkbckxyg) {case 1:boolean eutytgjb = false;break;default:long jzyyapvh = 712157346;break;}
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
    
}
}