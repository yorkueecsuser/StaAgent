import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        boolean gvgkdvmf = false;while (gvgkdvmf && true && false && true && true && true && true && true && true && true && false && false) {float jrnaihtx = 800041261;}
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}