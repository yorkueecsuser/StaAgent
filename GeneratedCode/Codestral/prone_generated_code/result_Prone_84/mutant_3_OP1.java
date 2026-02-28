import java.time.ZoneId;
import java.util.Random;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
        // BUG: InvalidZoneId

        // Adding a dead store as per the mutation operator
        String unusedVariable = generateRandomString(8);

        return ZoneId.of(invalidZoneId).toString();
    }

    // Method to generate a random string of a given length
    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }
}