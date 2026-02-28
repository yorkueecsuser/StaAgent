import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        int unusedVariable = 10; // Dead Store: Adding an unused integer variable
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
        String unusedString = "Mutated"; // Dead Store: Adding an unused string variable
        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}