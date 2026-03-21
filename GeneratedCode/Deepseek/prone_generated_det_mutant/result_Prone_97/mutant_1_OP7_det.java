import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        boolean rkwdnfxy = false;while (rkwdnfxy && false && true && true && false && true && false && true && false && true && false && false) {long mkpitumn = -465047558;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}