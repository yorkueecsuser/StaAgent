import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        boolean etkoqomi = false;while (etkoqomi && true && false && true && true && false && false && false && false && true && true && false) {long myhiengp = -797777107;}
        ZoneId zoneId = ZoneId.of("Z");
        return ZonedDateTime.now(zoneId);
    
}

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug());
    }
}