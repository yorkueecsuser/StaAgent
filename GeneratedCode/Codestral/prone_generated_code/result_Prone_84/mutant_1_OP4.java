import java.time.ZoneId;

class InvalidZoneIdBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String invalidZoneId) {
        // Applying the mutation operator: Unreachable if-else statement
        if (getUnreachableCondition()) {
            // This block of code is unreachable as the condition is always false
            throw new IllegalStateException("This code should not be executed");
        } else {
            // Original code
            return ZoneId.of(invalidZoneId).toString();
        }
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}