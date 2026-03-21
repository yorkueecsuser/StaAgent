import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        short asieoeqp = 5302;
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}