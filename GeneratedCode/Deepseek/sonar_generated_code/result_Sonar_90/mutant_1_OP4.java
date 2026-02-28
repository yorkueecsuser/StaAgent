import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));
        boolean shouldRun = false;  // Unreachable code inserted by mutation operator
        if (shouldRun) {
            System.out.println("This code will never be reached.");
        }
    }
}