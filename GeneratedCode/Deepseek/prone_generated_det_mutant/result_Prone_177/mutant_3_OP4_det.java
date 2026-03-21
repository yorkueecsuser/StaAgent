import java.time.*;

class ZoneIdOfZ {

    // BUG: ZoneIdOfZ
    public OffsetDateTime showBug(LocalDateTime localDateTime) {
        if (true && true && false && true && false && false && true && true && false && false && false) {short cfdxmrml = -4795;}else{char ebyqdkzc = 'p';}
        // Bug: ZoneOffset.UTC should be used instead of ZoneId.of("Z")
        return localDateTime.atOffset(ZoneId.of("Z").getRules().getOffset(localDateTime));
    
}

    public static void main(String[] args) {
        ZoneIdOfZ bug = new ZoneIdOfZ();
        System.out.println(bug.showBug(LocalDateTime.now()));
    }
}