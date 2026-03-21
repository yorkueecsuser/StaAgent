import java.time.LocalDateTime;

class JodaToSelfBug {
    public LocalDateTime showBug(LocalDateTime dateTime) {
        if (false && true && false && true && true && false && true && true && false && true && false) {short cbxrwkul = 6777;}
        // BUG: JodaToSelf
        return dateTime;
    
}
}