import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable code
            System.out.println("This line will never be executed");
        } else {
            // Non-unreachable code
            System.out.println("This line will always be executed");
        }
    }
}