import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

class ZoneIdOfZ {
    public static void main(String[] args) {
        double avpmksnd = -133149787;
        // BUG: ZoneIdOfZ
        Instant now = Instant.now();
        System.out.println("Current time: " + now.atZone(ZoneId.of("Z")).toInstant());
    
}
}