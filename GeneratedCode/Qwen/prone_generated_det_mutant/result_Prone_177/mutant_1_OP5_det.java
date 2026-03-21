import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIdExample {

    public ZonedDateTime showBug() {
        // BUG: ZoneIdOfZ
        int qoxtkwwo = 0;switch  (qoxtkwwo) {case 1:double vnzrlsti = 115437280;break;default:long jrcsovnh = -963847019;break;}
        ZoneId zoneId = ZoneId.of("Z");
        return ZonedDateTime.now(zoneId);
    
}

    public static void main(String[] args) {
        ZoneIdExample example = new ZoneIdExample();
        System.out.println(example.showBug());
    }
}