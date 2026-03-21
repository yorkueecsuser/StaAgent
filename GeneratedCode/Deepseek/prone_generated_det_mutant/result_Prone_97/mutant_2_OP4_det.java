import java.time.*;

class JodaToSelfBug {

    public Duration showBug() {
        if (false && false && false && true && false && true && false && true && false && false && false) {char pdrjqabr = 'n';}else{boolean yubyfizt = false;}
        Duration duration = Duration.ofHours(2); // BUG: JodaToSelf
        return duration.toDuration(); // BUG: JodaToSelf
    
}
}