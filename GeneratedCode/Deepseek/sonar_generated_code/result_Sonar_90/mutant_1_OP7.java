import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));

        // Mutation
        boolean conditionWhile = true;
        while (conditionWhile) {
            // unreachable code
            conditionWhile = false;
        }
    }
}