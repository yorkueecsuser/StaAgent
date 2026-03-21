import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        int fodphhen = 0;switch  (fodphhen) {case 1:short wituhyei = 9378;break;default:char crjuoovd = 'h';break;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}