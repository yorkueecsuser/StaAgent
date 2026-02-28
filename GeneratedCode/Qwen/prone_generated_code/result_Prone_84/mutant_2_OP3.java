import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug(String zoneId) {
        // This line contains the bug
        ZoneId zone = ZoneId.of(zoneId); // BUG: InvalidZoneId

        // Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        }

        return ZonedDateTime.now(zone);
    }

    private boolean getCondition() {
        // Always return false to ensure the if block is unreachable
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