import java.util.TimeZone;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);

        // Unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }

        return timeZone;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}