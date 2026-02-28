import java.util.Calendar;
import java.util.Date;

class DateBug {
    private boolean getFalseCondition() {
        return false; // Newly added method to return false condition
    }

    private Date buggyDate() {
        if(getFalseCondition()) { // Adding unreachable if-statement
            throw new RuntimeException("Unreachable code executed");
        }
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
        if(getFalseCondition()) { // Adding unreachable if-statement
            throw new RuntimeException("Unreachable code executed");
        }
        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}