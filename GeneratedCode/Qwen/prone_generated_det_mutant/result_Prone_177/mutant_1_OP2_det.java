import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {
public ZonedDateTime showBug() {
    ZoneId zoneId = ZoneId.of("Z");
    zoneId = ZoneId.of("Z");
    return ZonedDateTime.now(zoneId);
}

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug());
    }
}