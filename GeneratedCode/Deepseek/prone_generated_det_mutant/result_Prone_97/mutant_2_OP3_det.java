import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        if (true && false && true && true && false && true && false && false && true && true && false) {float dedxhude = 233282370;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}