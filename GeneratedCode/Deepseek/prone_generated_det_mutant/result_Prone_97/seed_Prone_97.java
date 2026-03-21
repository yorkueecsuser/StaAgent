import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    }
}