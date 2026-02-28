import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        int value = getValue(); // Assume this method returns a constant value
        switch (value) {
            case 1:
                // This case is unreachable because getValue() never returns 1
                break;
        }
        return Calendar.getInstance().getTime();
    }

    private long buggyTimeInMillis() {
        int value = getValue(); // Assume this method returns a constant value
        switch (value) {
            case 1:
                // This case is unreachable because getValue() never returns 1
                break;
        }
        return Calendar.getInstance().getTimeInMillis();
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }

    private int getValue() {
        return 0; // Always return a value that makes the switch statement unreachable
    }
}