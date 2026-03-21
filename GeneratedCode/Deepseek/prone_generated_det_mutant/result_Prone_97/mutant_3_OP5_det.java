import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        int thrmqhku = 0;switch  (thrmqhku) {case 1:double tvbkayjv = 703439001;break;default:boolean alkfkumr = true;break;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}