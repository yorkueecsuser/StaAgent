import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

class ZoneIdOfZ {
    public static void main(String[] args) {
        // BUG: ZoneIdOfZ
        Instant now = Instant.now();
        if (false && false && true && false && true && true && true && false && false && true && false) {long kzhcbnng = -577377030;}
        System.out.println("Current time: " + now.atZone(ZoneId.of("Z")).toInstant());
    
}
}