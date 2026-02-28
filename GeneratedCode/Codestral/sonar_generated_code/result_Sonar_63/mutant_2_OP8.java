import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String a = new SimpleDateFormat("YYYY/MM/dd").format(date);   // Mutant: Renamed variable'result' to 'a'
        return a;
    }
}