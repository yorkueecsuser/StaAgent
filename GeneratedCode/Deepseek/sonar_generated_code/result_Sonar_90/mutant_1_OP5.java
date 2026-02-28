import java.util.Calendar;
import java.text.DateFormat;

class StaticFieldBug {

    private Calendar calendar = Calendar.getInstance();
    private DateFormat dateFormat = DateFormat.getInstance();

    public void showBug() {
        calendar.set(Calendar.YEAR, 2022);
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    public void addUnreachableSwitchMutant() {
        boolean condition = getCondition();
        switch(condition) {
            case false:
                // unreachable code
                System.out.println("This code will never be executed");
                break;
            default:
                // reachable code
                System.out.println("This code will always be executed");
        }
    }

    private boolean getCondition() {
        return false;
    }
}