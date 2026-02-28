import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // Original assignment statement
        // Mutant code: Duplicate of the original assignment statement
        String duplicateResult = new SimpleDateFormat("YYYY/MM/dd").format(date);
        return result;
    }
}