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
        
        // Introduce an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This value should always ensure no case is hit
        switch (unreachableValue) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            // Add a default case to ensure the switch is complete
            default:
                break;
        }

        return "SimpleDateFormat result: " + result1 + ", DateTimeFormatter result: " + result2;
    }

    private int getUnreachableValue() {
        // Generate a value that ensures the switch never hits cases 1 or 2
        return 3; // This value does not match any case in the switch
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