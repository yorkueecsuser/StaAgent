import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug(String zoneId) {
        // This line contains the bug
        ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId

        // Introduced an unreachable if-else statement based on the mutation operator
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that should never run
            System.out.println("This is an unreachable if block.");
        } else {
            // Alternative code that should also never run
            System.out.println("This is an unreachable else block.");
        }

        return ZonedDateTime.now(zone);
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        try {
            example.showBug("NonExistent/TimeZone");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}