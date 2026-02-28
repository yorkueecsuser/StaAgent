import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar myCalendar = Calendar.getInstance();
    private DateFormat myDateFormat = DateFormat.getInstance();

    public void showBug() {
        myCalendar.set(Calendar.YEAR, 2022);
        System.out.println(myDateFormat.format(myCalendar.getTime()));
    }
}