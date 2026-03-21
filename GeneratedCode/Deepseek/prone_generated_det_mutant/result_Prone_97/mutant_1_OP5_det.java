import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        int btlqzkki = 0;switch  (btlqzkki) {case 1:int crgmnauy = 303061603;break;default:String frrdrssk = "vdsjicvm";break;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}