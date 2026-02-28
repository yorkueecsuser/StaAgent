import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting

        // Mutant code: Unreachable if-else statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            // This code is unreachable
            System.out.println("This line should never be printed.");
        } else {
            // This is the reachable branch
            System.out.println("This line should always be printed.");
        }

        return result;
    }
}