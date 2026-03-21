import java.time.LocalDateTime;

class JodaToSelfBug {
    public LocalDateTime showBug(LocalDateTime dateTime) {
        if (false && true && true && true && false && true && false && true && true && false && false) {char xlrvrghg = 'h';}
        // BUG: JodaToSelf
        return dateTime;
    
}
}