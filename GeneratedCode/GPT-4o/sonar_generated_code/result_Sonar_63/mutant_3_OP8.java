import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateFormatExample {

    public String showBug() throws ParseException {
        // Noncompliant example using SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date date = simpleDateFormat.parse("2015/12/31");
        String result1 = new SimpleDateFormat("YYYY/MM/dd").format(date);  // BUG: Week Year ("YYYY") should not be used for date formatting

        // Noncompliant example using DateTimeFormatter
        LocalDate localDate = LocalDate.of(2015, 12, 31);
        String result2 = DateTimeFormatter.ofPattern("YYYY/MM/dd").format(localDate); // BUG: Week Year ("YYYY") should not be used for date formatting

        return "SimpleDateFormat result: " + result1 + ", DateTimeFormatter result: " + result2;
    }

    public String showBugMutant() throws ParseException {
        // Noncompliant example using SimpleDateFormat
        SimpleDateFormat a = new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date b = a.parse("2015/12/31");
        String c = new SimpleDateFormat("YYYY/MM/dd").format(b);  // BUG: Week Year ("YYYY") should not be used for date formatting

        // Noncompliant example using DateTimeFormatter
        LocalDate d = LocalDate.of(2015, 12, 31);
        String e = DateTimeFormatter.ofPattern("YYYY/MM/dd").format(d); // BUG: Week Year ("YYYY") should not be used for date formatting

        return "SimpleDateFormat result: " + c + ", DateTimeFormatter result: " + e;
    }

    public static void main(String[] args) {
        DateFormatExample example = new DateFormatExample();
        try {
            System.out.println(example.showBug());
            System.out.println(example.showBugMutant());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}