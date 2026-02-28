import java.util.TimeZone;

class TimeZoneBug {
    // Method to generate the condition for the loop
    private boolean getCondition() {
        return false; // Always returns false
    }

    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId); // BUG: InvalidTimeZoneID

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }

        return timeZone;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}