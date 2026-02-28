import java.util.TimeZone;

class TimeZoneBug {
    public TimeZone showBug(String timeZoneId) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);
        // Inserting an unreachable while loop as per mutation operator instructions
        while (getCondition()) {
            // This code is unreachable
            System.out.println("This line of code is unreachable.");
        }
        return timeZone;
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        TimeZoneBug bug = new TimeZoneBug();
        TimeZone timeZone = bug.showBug("Invalid/TimeZone");
        System.out.println("TimeZone: " + timeZone.getID());
    }
}