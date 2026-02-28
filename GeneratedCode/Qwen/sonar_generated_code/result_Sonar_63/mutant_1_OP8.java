import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class DateFormatBug {

    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting
        String a = result; // Mutant: Renamed'result' to 'a'
        return a;
    }

    public String showBug2() {
        LocalDate localDate = LocalDate.parse("2015-12-31");
        String result = DateTimeFormatter.ofPattern("YYYY/MM/dd").format(localDate); // BUG: Week Year ("YYYY") should not be used for date formatting
        String b = result; // Mutant: Renamed'result' to 'b'
        return b;
    }

    public static void main(String[] args) {
        DateFormatBug bugDemo = new DateFormatBug();
        try {
            System.out.println("Bug with SimpleDateFormat: " + bugDemo.showBug());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Bug with DateTimeFormatter: " + bugDemo.showBug2());
    }
}