import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));
        
        // Unreachable If Statement Mutation
        if (false) {
            System.out.println("This code will never run");
        }
    }
}