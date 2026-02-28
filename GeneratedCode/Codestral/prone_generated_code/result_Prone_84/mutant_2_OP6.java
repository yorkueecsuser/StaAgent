import java.time.ZoneId;

class InvalidZoneIdBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String invalidZoneId) {
        // Added unreachable for loop mutant
        for (int i = 0; getFalseCondition(); i++) {
            // This loop is unreachable as the condition is always false
            System.out.println("This is an unreachable for loop mutant");
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