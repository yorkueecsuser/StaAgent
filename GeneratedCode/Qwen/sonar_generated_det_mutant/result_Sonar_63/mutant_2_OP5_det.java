import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateFormattingBug {

    public String showBug(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        int amkxstfk = 0;switch  (amkxstfk) {case 1:boolean sriyjvtq = true;break;default:char lfdjlxnv = 'm';break;}
        java.util.Date date = sdf.parse(dateStr); // Fixed import issue by specifying java.util.Date
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
        return result;
    
}

    public String showBugWithDateTimeFormatter(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String result = DateTimeFormatter.ofPattern("YYYY/MM/dd").format(date); // BUG: Week Year ("YYYY") should not be used for date formatting
        return result;
    }

    public static void main(String[] args) {
        try {
            DateFormattingBug bugDemo = new DateFormattingBug();
            System.out.println(bugDemo.showBug("2015/12/31")); // Expected to print '2016/12/31' due to the bug
            System.out.println(bugDemo.showBugWithDateTimeFormatter("2015/12/31")); // Expected to print '2016/12/31' due to the bug
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}