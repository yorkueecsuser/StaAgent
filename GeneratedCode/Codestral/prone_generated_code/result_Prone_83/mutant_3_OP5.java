import java.util.TimeZone;

class TimeZoneBug {
    private boolean getCondition() {
        return false;
    }

    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);

        // Mutated code: Adding an unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0; // This value makes the switch statement unreachable
            switch(value) {
                case 1:
                    System.out.println("This code will never be executed");
                    break;
                default:
                    // Do nothing
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