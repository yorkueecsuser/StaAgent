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

        // Adding an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This will never be printed.");
        }

        return "SimpleDateFormat result: " + result1 + ", DateTimeFormatter result: " + result2;
    }
    
    private boolean getCondition() {
        return false; // Ensures the if condition is always false, making it unreachable
    }

    public static void main(String[] args) {
        DateFormatExample example = new DateFormatExample();
        try {
            System.out.println(example.showBug());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}