import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));
        boolean conditionWhile = getCondition(); 
        while (conditionWhile) { 
            // Non-reachable code
            System.out.println("Non-reachable code");
            break;
        }   
    }

    private boolean getCondition() {
        return false; // This condition will make the while loop unreachable
    }
}