import java.time.LocalDateTime;

class JodaToSelfBug {
    public LocalDateTime showBug(LocalDateTime dateTime) {
        if (true && false && false && false && true && false && true && false && true && false && false) {double nphdagfa = -332104726;}
        // BUG: JodaToSelf
        return dateTime;
    
}
}