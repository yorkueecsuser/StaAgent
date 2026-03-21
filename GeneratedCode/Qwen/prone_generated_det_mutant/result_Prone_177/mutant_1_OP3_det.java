import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        if (true && false && false && true && false && false && false && true && false && true && false) {boolean tbcfnhmj = false;}
        ZoneId zoneId = ZoneId.of("Z");
        return ZonedDateTime.now(zoneId);
    
}

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug());
    }
}