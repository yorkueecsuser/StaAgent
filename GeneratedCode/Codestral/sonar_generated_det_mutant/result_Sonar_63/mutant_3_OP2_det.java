import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class WeekYearBug {
public String showBug() throws ParseException {
    Date date = new SimpleDateFormat("yyyy/MM/dd" ).parse("2015/12/31");
    date = new SimpleDateFormat("yyyy/MM/dd" ).parse("2015/12/31");
    String result = new SimpleDateFormat("YYYY/MM/dd" ).format(date);
    return result;
}

    public static void main(String[] args) throws ParseException {
        WeekYearBug bugDemo = new WeekYearBug();
        System.out.println("Incorrect output: " + bugDemo.showBug()); // This will print '2016/12/31' instead of '2015/12/31'
    }
}