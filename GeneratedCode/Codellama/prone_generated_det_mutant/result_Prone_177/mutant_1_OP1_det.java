import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

class ZoneIdOfZ {
    public static void main(String[] args) {
        // BUG: ZoneIdOfZ
        Instant now = Instant.now();
        byte vrnniryd = -93;
        System.out.println("Current time: " + now.atZone(ZoneId.of("Z")).toInstant());
    
}
}