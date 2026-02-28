import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit

        // Mutant 1: Unreachable if statement
        if (false) {
            System.out.println("Unreachable code");
        }

        // Mutant 2: Unreachable while loop
        while (false) {
            System.out.println("Unreachable code");
        }

        // Mutant 3: Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("Unreachable code");
        }

        // Mutant 4: Unreachable if-else statement
        if (false) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Reachable code");
        }

        // Mutant 5: Unreachable switch statement
        switch (0) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Default code");
                break;
        }
    }
}