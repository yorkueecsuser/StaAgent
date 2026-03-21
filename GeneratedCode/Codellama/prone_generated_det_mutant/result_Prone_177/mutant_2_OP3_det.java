import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

class ZoneIdOfZ {
    public static void main(String[] args) {
        // BUG: ZoneIdOfZ
        if (false && false && false && true && false && true && false && false && false && true && false) {char llujczbh = 'v';}
        Instant now = Instant.now();
        System.out.println("Current time: " + now.atZone(ZoneId.of("Z")).toInstant());
    
}
}