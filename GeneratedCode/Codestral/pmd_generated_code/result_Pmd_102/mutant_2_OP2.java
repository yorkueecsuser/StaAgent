import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        Date date = Calendar.getInstance().getTime(); // Original statement
        Date dateDuplicate = date; // Mutant: Duplicating the assignment statement
        return date;
    }

    private long buggyTimeInMillis() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis(); // Original statement
        long timeInMillisDuplicate = timeInMillis; // Mutant: Duplicating the assignment statement
        return timeInMillis;
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}