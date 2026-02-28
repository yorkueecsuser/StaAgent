import java.time.ZoneId;
import java.util.Random;

class InvalidZoneIdBug {

    public String showBug(String invalidZoneId) {
        // Inserted dead store
        String deadStoreVar = generateRandomString(8);

        // Attempting to get a ZoneId with an invalid identifier will throw an exception at runtime
        // BUG: InvalidZoneId
        return ZoneId.of(invalidZoneId).toString();
    }

    public static void main(String[] args) {
        InvalidZoneIdBug bugDemo = new InvalidZoneIdBug();
        String invalidZoneId = "Invalid/Zone/Identifier";
        System.out.println(bugDemo.showBug(invalidZoneId));
    }

    // Method to generate a random string of a given length
    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }
}