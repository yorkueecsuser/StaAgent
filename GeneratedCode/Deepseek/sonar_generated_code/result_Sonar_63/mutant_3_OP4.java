import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    public String[] showBug() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result1 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        String result2 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        
        // Mutated Code:
        // Unreachable if-else statement mutation, making one branch of the if-else statement unreachable
        // The condition is deliberately set to always be false to make the branch unreachable
        // The branch code remains unchanged from original for both versions

        boolean unreachable = false;
        if (unreachable) {
            String unreachableResult1 = new SimpleDateFormat("YYYY/MM/dd").format(date);
            String unreachableResult2 = new SimpleDateFormat("YYYY/MM/dd").format(date);
        } else {
            // This branch is intentionally left blank to make it unreachable
        }

        return new String[]{result1, result2};
    }
}