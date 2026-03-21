import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

class ZoneIdOfZ {
public static void main(String [] args){
    Instant now = Instant.now();
    now = Instant.now();
    System.out.println("Current time: " + now.atZone(ZoneId.of("Z")).toInstant());
}
}