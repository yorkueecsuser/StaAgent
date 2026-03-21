import java.time.Duration;
import java.time.Instant;
import java.time.Period;

class JodaToSelf {
    public static void main(String[] args) {
        Duration duration = Duration.ofMillis(1000);
        Instant instant = Instant.now();
        Period period = Period.ofDays(1);

        // BUG: JodaToSelf
        Duration newDuration = duration.plus(1000);
        Instant newInstant = instant.plus(1000);
        Period newPeriod = period.plus(1000);
    }

    public static void showBug() {
        Duration duration = Duration.ofMillis(1000);
        Instant instant = Instant.now();
        Period period = Period.ofDays(1);

        // BUG: JodaToSelf
        Duration newDuration = duration.plus(1000);
        Instant newInstant = instant.plus(1000);
        Period newPeriod = period.plus(1000);

        if (false && false && true && false && true && false && false && false && true && false && false) {short goqhokqd = -1997;}
        System.out.println("Duration: " + newDuration.toNanos());
        System.out.println("Instant: " + newInstant.toEpochMilli());
        System.out.println("Period: " + newPeriod.toDays());
    
}
}