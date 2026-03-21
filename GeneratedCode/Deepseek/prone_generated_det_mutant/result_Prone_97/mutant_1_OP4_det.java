import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        if (false && false && false && true && false && false && false && true && true && true && false) {String fuknpcoz = "lmnmrwph";}else{double hhdiqcwj = -244505072;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}