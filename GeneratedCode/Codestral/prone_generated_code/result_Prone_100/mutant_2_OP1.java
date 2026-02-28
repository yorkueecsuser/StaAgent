import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // Dead store mutation: Adding an unused string variable declaration
        String deadStore = generateRandomString(8);
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    // Method to generate a random string of a given length
    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (length > 0) {
            result.append(characters.charAt(rnd.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}