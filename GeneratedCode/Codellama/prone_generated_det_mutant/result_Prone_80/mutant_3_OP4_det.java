import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        if (true && false && true && true && true && true && false && true && false && true && false) {byte vvfvryug = -13;}else{byte cinljyne = 51;}
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}