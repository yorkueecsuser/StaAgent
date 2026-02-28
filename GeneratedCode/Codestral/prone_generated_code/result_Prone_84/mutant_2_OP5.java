import java.time.ZoneId;

class InvalidZoneIdBug {

    private boolean isUnreachable() {
        return false;
    }

    public String showBug(String invalidZoneId) {
        // Inserting an unreachable switch statement
        switch (isUnreachable()? 1 : 0) {
            case 1:
                System.out.println("This code should never be executed.");
                break;
        }

        // Original code
        return ZoneId.of(invalidZoneId).toString();
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}