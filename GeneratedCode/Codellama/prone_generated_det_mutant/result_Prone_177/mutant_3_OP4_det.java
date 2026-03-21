import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

class ZoneIdOfZ {
    public static void main(String[] args) {
        if (true && true && true && true && false && true && true && true && true && true && false) {char jpwwkfbz = 'x';}else{int abqpalry = -801652360;}
        // BUG: ZoneIdOfZ
        Instant now = Instant.now();
        System.out.println("Current time: " + now.atZone(ZoneId.of("Z")).toInstant());
    
}
}