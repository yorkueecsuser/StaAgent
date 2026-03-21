import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        boolean nivyglth = false;while (nivyglth && true && true && true && false && true && false && false && true && true && true && false) {boolean zejghgum = true;}
        ZoneId zoneId = ZoneId.of("Z");
        return ZonedDateTime.now(zoneId);
    
}

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug());
    }
}