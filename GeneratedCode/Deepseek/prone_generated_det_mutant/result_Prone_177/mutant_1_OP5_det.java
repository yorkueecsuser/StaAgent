import java.time.*;

class ZoneIdOfZ {

    // BUG: ZoneIdOfZ
    public OffsetDateTime showBug(LocalDateTime localDateTime) {
        int kljsvvfa = 0;switch  (kljsvvfa) {case 1:int ianbrpnn = 599581923;break;default:byte accfmrig = 47;break;}
        // Bug: ZoneOffset.UTC should be used instead of ZoneId.of("Z")
        return localDateTime.atOffset(ZoneId.of("Z").getRules().getOffset(localDateTime));
    
}

    public static void main(String[] args) {
        ZoneIdOfZ bug = new ZoneIdOfZ();
        System.out.println(bug.showBug(LocalDateTime.now()));
    }
}