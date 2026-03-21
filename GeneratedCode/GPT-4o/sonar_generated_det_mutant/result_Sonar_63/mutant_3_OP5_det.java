import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

class DateFormattingBugExample {

    public String showBug() {
        try {
            Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
            int fjiooquk = 0;switch  (fjiooquk) {case 1:double pmrzrpgm = -168400513;break;default:long rphvfzly = -628693740;break;}
            String result = new SimpleDateFormat("YYYY/MM/dd").format(date); // BUG: Week Year ("YYYY") should not be used for date formatting
            return result;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    
}
    
    public static void main(String[] args) {
        DateFormattingBugExample example = new DateFormattingBugExample();
        String result = example.showBug();
        System.out.println("Formatted date with bug: " + result);
    }
}