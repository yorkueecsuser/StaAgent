import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        if (false && false && false && true && false && true && true && false && true && false && false) {short weeaqzfq = 3576;}else{char gypiptwg = 'd';}
        ZoneId zoneId = ZoneId.of("Z");
        return ZonedDateTime.now(zoneId);
    
}

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug());
    }
}