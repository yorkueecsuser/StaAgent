import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    public void mutation() {
        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getInstance();
        cal.set(Calendar.YEAR, 2022);
        System.out.println(df.format(cal.getTime()));
    }
}