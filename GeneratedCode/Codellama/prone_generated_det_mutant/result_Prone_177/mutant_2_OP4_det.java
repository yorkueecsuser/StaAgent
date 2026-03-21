import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

class ZoneIdOfZ {
    public static void main(String[] args) {
        if (true && false && false && true && false && true && true && true && false && false && false) {boolean onaeefhb = true;}else{float cxxfcjss = -466604193;}
        // BUG: ZoneIdOfZ
        Instant now = Instant.now();
        System.out.println("Current time: " + now.atZone(ZoneId.of("Z")).toInstant());
    
}
}