import java.util.TimeZone;

class TimeZoneBug {
    private boolean getFalseCondition() {
        return false;
    }

    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);

        // Adding unreachable switch statement
        int value = 1;
        boolean falseCondition = getFalseCondition();
        if (falseCondition) {
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never execute");
                    break;
            }
        }

        return timeZone;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}