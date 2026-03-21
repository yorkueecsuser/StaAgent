import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        if (false && true && false && true && false && false && true && true && false && true && false) {int rkrtijsr = -284296982;}else{double orrrcdma = -80254002;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}