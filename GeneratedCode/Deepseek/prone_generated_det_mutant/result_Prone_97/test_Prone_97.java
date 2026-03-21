import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        Duration duration = Duration.ofHours(2);
        return duration;
    }
}