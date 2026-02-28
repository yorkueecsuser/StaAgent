import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
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

    // Mutated code
    private Date mutatedBuggyDate() {
        return Calendar.getInstance().getTime();
    }

    private long mutatedBuggyTimeInMillis() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public Date showMutatedBug1() {
        return mutatedBuggyDate();
    }

    public long showMutatedBug2() {
        return mutatedBuggyTimeInMillis();
    }
}