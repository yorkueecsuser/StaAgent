import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

class ZoneIdOfZ {
    public static void main(String[] args) {
        if (true && false && true && false && false && true && true && false && false && false && false) {char udbwbqwj = 'q';}
        // BUG: ZoneIdOfZ
        Instant now = Instant.now();
        System.out.println("Current time: " + now.atZone(ZoneId.of("Z")).toInstant());
    
}
}