import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed");
        } else {
            // No need to add anything here as this block is unreachable
        }
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the if block unreachable
    }
}