import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        switch (getFalseValue()) {
            case 1:
                System.out.println("This statement will never be executed");
                break;
        }
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
        if (getFalseCondition()) {
            System.out.println("This statement will never be executed");
        }
        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }

    private int getFalseValue() {
        return -1;
    }

    private boolean getFalseCondition() {
        return false;
    }
}