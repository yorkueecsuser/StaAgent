import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        // Mutant: Dead Store
        int deadStoreVariable = 10; // Unused variable
        return Calendar.getInstance().getTime();
    }

    private long buggyTimeInMillis() {
        // Mutant: Dead Store
        String deadStoreVariable = "unused"; // Unused variable
        return Calendar.getInstance().getTimeInMillis();
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}