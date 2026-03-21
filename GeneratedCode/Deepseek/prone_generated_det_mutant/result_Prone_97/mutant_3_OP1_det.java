import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        int cgwuffqo = 473762876;
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}