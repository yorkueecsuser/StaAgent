import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    }
}

// Unreachable switch statement
int value = getValue();
switch(value) {
    case 1:
        System.out.println("Case 1");
        break;
    case 2:
        System.out.println("Case 2");
        break;
    default:
        System.out.println("Default");
        break;
}

public int getValue() {
    // Generate a random number between 1 and 2
    return new Random().nextInt(2) + 1;
}