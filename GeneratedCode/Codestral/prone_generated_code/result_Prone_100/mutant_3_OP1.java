import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

class LocalDateBug {

    public LocalDate showBug() {
        LocalDate date = LocalDate.now();
        // Added dead store
        int unusedVariable = generateRandomNumber();
        // BUG: LocalDateTemporalAmount (Duration cannot be added to LocalDate)
        return date.plus(Duration.ofDays(1));
    }

    // Method to generate a random number
    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        LocalDateBug bug = new LocalDateBug();
        System.out.println(bug.showBug());
    }
}