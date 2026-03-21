import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        for  (int duhfwlbo = 0; duhfwlbo < 0; duhfwlbo++) {double ogwysccp = 112241047;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}