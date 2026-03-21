import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        for  (int zuekjqjg = 0; zuekjqjg < 0; zuekjqjg++) {short rtxpebsf = 8858;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}