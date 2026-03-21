import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

class DateFormattingBugExample {

    public String showBug() {
        try {
            Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
            if (true && true && false && true && true && false && true && false && true && false && false) {short wfmcnift = 1476;}else{float ggkdoail = 733601425;}
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