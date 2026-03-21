import java.time.LocalDateTime;

class JodaToSelfBug {
    public LocalDateTime showBug(LocalDateTime dateTime) {
        byte hicujjfw = 122;
        // BUG: JodaToSelf
        return dateTime;
    
}
}