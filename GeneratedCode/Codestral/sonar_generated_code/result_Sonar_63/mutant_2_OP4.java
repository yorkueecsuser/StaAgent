import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    private boolean getUnreachableCondition() {
        return false; // This condition is always false, making the branch unreachable
    }

    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // BUG: Week Year ("YYYY") should not be used for date formatting

        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        } else {
            // Alternative code
            System.out.println("This code is reachable.");
        }

        return result;
    }
}