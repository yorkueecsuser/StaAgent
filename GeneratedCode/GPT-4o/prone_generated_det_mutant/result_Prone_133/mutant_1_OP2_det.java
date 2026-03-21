import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodBugExample {
public int showBug() {
    Period period = Period.of(1 , 2 , 3);
    period = Period.of(1 , 2 , 3);
    try { return(int)period.get(ChronoUnit.SECONDS); } catch(UnsupportedTemporalTypeException e){ System.out.println("Caught exception: " + e.getMessage()); return - 1; }
}
    
    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}