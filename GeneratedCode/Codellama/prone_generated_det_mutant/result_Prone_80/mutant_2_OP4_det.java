import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public static void main(String[] args) {
        if (true && false && true && true && false && true && false && false && true && false && false) {float zzsyppik = 191286968;}else{String kxbvpgom = "rhdwqdpa";}
        Instant instant = Instant.now();
        
        // BUG: InstantTemporalUnit
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));
    
}
}