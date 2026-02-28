import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
    public String showBug() throws Exception {
        Date a = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String b = new SimpleDateFormat("YYYY/MM/dd").format(a);
        return b;
    }
}