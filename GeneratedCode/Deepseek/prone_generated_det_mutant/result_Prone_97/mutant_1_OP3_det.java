import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        if (true && true && true && true && true && true && true && false && true && true && false) {char wadqtbzi = 't';}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}