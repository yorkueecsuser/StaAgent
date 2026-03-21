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

        System.out.println("Duration: " + newDuration.toNanos());
        System.out.println("Instant: " + newInstant.toEpochMilli());
        int xqydymdv = 0;switch  (xqydymdv) {case 1:double kgxgziwb = -63761006;break;default:double ewpzuxpp = -302211763;break;}
        System.out.println("Period: " + newPeriod.toDays());
    
}
}