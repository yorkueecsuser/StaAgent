import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        Date buggyDate = Calendar.getInstance().getTime(); // Original code
        Date duplicatedDate = buggyDate; // Mutant: Duplicated assignment
        return buggyDate;
    }

    private long buggyTimeInMillis() {
        long buggyTime = Calendar.getInstance().getTimeInMillis(); // Original code
        long duplicatedTime = buggyTime; // Mutant: Duplicated assignment
        return buggyTime;
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}