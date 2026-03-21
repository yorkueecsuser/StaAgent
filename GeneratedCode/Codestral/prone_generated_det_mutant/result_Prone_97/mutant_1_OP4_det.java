import java.time.LocalDateTime;

class JodaToSelfBug {
    public LocalDateTime showBug(LocalDateTime dateTime) {
        if (false && false && false && true && true && false && true && false && true && false && false) {double hbzdryvu = 381901134;}else{long zmdosxou = -871572505;}
        // BUG: JodaToSelf
        return dateTime;
    
}
}