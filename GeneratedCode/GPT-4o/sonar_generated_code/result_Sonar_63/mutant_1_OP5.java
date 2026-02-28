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

        // Unreachable switch statement mutant
        int unreachableSwitchVariable = getUnreachableSwitchValue();
        switch (unreachableSwitchVariable) {
            case 0:
                System.out.println("This case is not supposed to be executed.");
                break;
            default:
                System.out.println("Default case for unreachable switch.");
                break;
        }

        return "SimpleDateFormat result: " + result1 + ", DateTimeFormatter result: " + result2;
    }

    private int getUnreachableSwitchValue() {
        return 2; // This ensures the case 0 is never reached
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