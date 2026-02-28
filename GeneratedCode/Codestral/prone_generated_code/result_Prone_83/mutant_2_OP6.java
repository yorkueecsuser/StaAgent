import java.util.TimeZone;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID

        boolean conditionFor = getCondition(); // Dynamically determine the loop condition
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
            System.out.println("This loop will never execute.");
        }

        return timeZone;
    }

    public static boolean getCondition() {
        // Placeholder method to dynamically determine the loop condition
        return false;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}