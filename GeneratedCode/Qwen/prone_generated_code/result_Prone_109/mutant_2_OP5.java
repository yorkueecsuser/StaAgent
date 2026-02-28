import java.text.SimpleDateFormat;
import java.util.Date;

class DatePatternBug {

    public String showBug() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/yyyy"); // BUG: MisusedDayOfYear
        Date date = new Date();
        return sdf.format(date);

        // Introduced Unreachable Switch Statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is never true
                System.out.println("This is an unreachable case.");
                break;
            default:
                // This default case will also never be executed
                System.out.println("This is also an unreachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, ensuring the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        DatePatternBug bugDemo = new DatePatternBug();
        System.out.println(bugDemo.showBug());
    }
}