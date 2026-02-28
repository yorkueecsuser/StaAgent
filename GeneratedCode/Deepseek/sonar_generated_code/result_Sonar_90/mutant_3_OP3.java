import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));

        if(true!= true) {
            calendar.set(Calendar.YEAR, 2023);
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}