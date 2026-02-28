import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.YEAR, 2022); // Mutation
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}