import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        // Inserting an unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This line will never be executed.");
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
}