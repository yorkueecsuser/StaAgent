import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This should never print.");
                break;
        }
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This should never print.");
        }
        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }

    private int getUnreachableValue() {
        // This method returns a value that is not 1 to ensure the switch statement is unreachable
        return 0;
    }

    private boolean getUnreachableCondition() {
        // This method returns false to ensure the if statement is unreachable
        return false;
    }
}