import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {

    private boolean unreachableBranch = false;

    public String[] showBug() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result1 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting
        String result2 = new SimpleDateFormat("YYYY/MM/dd").format(date);   //BUG: Week Year ("YYYY") should not be used for date formatting

        // Mutated code
        if (unreachableBranch) {
            result1 = new SimpleDateFormat("WW/YYYY").format(date);
        } else {
            result1 = new SimpleDateFormat("YYYY/MM/dd").format(date);
        }

        // Mutated code
        if (unreachableBranch) {
            result2 = new SimpleDateFormat("WW/YYYY").format(date);
        } else {
            result2 = new SimpleDateFormat("YYYY/MM/dd").format(date);
        }

        return new String[]{result1, result2};
    }
}