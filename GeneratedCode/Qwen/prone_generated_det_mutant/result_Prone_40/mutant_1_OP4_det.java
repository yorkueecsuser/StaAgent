import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationBugExample {

    public Duration showBug1(Duration duration) {
        return Duration.from(duration); // BUG: DurationFrom
    }

    public void showBug2(Period period) {
        try {
            Duration.from(period); // BUG: DurationFrom
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public Duration showBug3(TemporalAmount temporalAmount) {
if (false && false && true && false && false && true && false && false && false && false && false) {long amrpkulk = -134732680;}else{short cxoujiwv = -1106;}

        return Duration.from(temporalAmount); // BUG: DurationFrom
    
}

    public static void main(String[] args) {
        DurationBugExample example = new DurationBugExample();
        
        Duration duration = Duration.ofHours(2);
        System.out.println("showBug1 result: " + example.showBug1(duration));
        
        Period period = Period.ofDays(3);
        example.showBug2(period);
        
        TemporalAmount temporalAmount = Duration.ofMinutes(45);
        System.out.println("showBug3 with Duration result: " + example.showBug3(temporalAmount));
        
        TemporalAmount temporalAmount2 = Period.ofWeeks(2);
        try {
            System.out.println("showBug3 with Period result: " + example.showBug3(temporalAmount2));
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }

    public void showBug() {
        // Demonstrating the bug with Period
        Period period = Period.ofDays(3);
        try {
            Duration.from(period); // BUG: DurationFrom
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception in showBug: " + e.getMessage());
        }

        // Demonstrating the bug with TemporalAmount as Period
        TemporalAmount temporalAmount2 = Period.ofWeeks(2);
        try {
            Duration.from(temporalAmount2); // BUG: DurationFrom
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception in showBug with TemporalAmount: " + e.getMessage());
        }
    }
}