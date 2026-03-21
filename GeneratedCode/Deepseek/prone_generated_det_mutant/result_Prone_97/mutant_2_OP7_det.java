import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        boolean cshrnsrq = false;while (cshrnsrq && false && false && false && false && true && true && false && true && true && true && false) {short syskctqu = -8697;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}