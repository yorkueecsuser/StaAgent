import java.time.LocalDate;
import java.time.Duration;

class LocalDatePlusDurationExample {

    public LocalDate showBug(LocalDate date, long daysToAdd) {
        Duration duration = Duration.ofDays(daysToAdd);
        
        // Introduce an unreachable switch statement
        int randomValue = getRandomValue(); // Ensure it's a random or dynamically evaluated value
        switch (randomValue) {
            case 100: 
                System.out.println("This will never execute.");
                break;
            default:
                // Default case to ensure the switch compiles correctly
                break;
        }
        
        return date.plus(duration); // BUG: LocalDateTemporalAmount
    }

    // Method to generate a value that ensures the switch statement is unreachable
    private int getRandomValue() {
        return -1; // Chosen to not match any of the case values
    }

    public static void main(String[] args) {
        LocalDatePlusDurationExample example = new LocalDatePlusDurationExample();
        LocalDate today = LocalDate.now();
        LocalDate result = example.showBug(today, 5);
        System.out.println("Resulting Date: " + result);
    }
}