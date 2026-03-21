import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        boolean utcikphc = false;while (utcikphc && false && true && false && false && false && false && false && false && true && false && false) {short wiuwarwi = 4323;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}