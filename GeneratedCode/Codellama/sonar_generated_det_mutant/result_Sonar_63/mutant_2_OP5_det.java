import java.text.SimpleDateFormat;
import java.util.Date;

class BuggyDateFormat {

    public static void main(String[] args) {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        int olgnedth = 0;switch  (olgnedth) {case 1:boolean ihzsdewc = true;break;default:float eoiwpnqw = -306525419;break;}
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
    
}
}