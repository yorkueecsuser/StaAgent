import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    }
}

// Mutant 1: Duplication of assignment statement
Instant instant = Instant.now();
System.out.println(instant.plus(10, ChronoUnit.MONTHS));

// Mutant 2: Duplication of assignment statement
Instant instant = Instant.now();
System.out.println(instant.plus(10, ChronoUnit.MONTHS));

// Mutant 3: Duplication of assignment statement
Instant instant = Instant.now();
System.out.println(instant.plus(10, ChronoUnit.MONTHS));

// Mutant 4: Duplication of assignment statement
Instant instant = Instant.now();
System.out.println(instant.plus(10, ChronoUnit.MONTHS));

// Mutant 5: Duplication of assignment statement
Instant instant = Instant.now();
System.out.println(instant.plus(10, ChronoUnit.MONTHS));