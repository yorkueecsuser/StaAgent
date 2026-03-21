import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        if (true && false && false && false && false && false && false && true && true && true && false) {byte difqahmx = -33;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}