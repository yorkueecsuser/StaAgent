import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.
        // MUTATION: Adding a Dead Store

        // Generating a random 8-character string for the variable name
        String randomVariableName = generateRandomString(8);

        // Declaring and initializing a dead store variable with a random integer
        int deadStoreVariable = new Random().nextInt();

        return instant.plus(1, ChronoUnit.WEEKS);
    }

    // Method to generate a random string of a given length
    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (length > 0) {
            result.append(characters.charAt(rnd.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }
}