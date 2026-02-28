import java.time.ZoneId;

class InvalidZoneIdBug {

    private boolean getCondition() {
        // This method is used to ensure the loop condition is not a compile-time constant
        return false;
    }

    public String showBug(String invalidZoneId) {
        boolean condition = getCondition();
        // Unreachable for loop mutant
        for (int i = 0; condition; i++) {
            // This code will never be executed
            System.out.println("Unreachable for loop mutant");
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