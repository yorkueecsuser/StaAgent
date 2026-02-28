import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable code
            System.out.println("This code should never execute.");
        }
        return Calendar.getInstance().getTime();
    }

    private long buggyTimeInMillis() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute.");
        }
        return Calendar.getInstance().getTimeInMillis();
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}