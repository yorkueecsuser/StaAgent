import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        for  (int pnsvnyuq = 0; pnsvnyuq < 0; pnsvnyuq++) {char xkdlaerw = 'c';}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}