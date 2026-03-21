import java.time.*;

class ZoneIdOfZ {

    // BUG: ZoneIdOfZ
    public OffsetDateTime showBug(LocalDateTime localDateTime) {
        if (false && true && true && true && true && true && false && true && true && true && false) {String bcrqjvrl = "wkwywssf";}
        // Bug: ZoneOffset.UTC should be used instead of ZoneId.of("Z")
        return localDateTime.atOffset(ZoneId.of("Z").getRules().getOffset(localDateTime));
    
}

    public static void main(String[] args) {
        ZoneIdOfZ bug = new ZoneIdOfZ();
        System.out.println(bug.showBug(LocalDateTime.now()));
    }
}