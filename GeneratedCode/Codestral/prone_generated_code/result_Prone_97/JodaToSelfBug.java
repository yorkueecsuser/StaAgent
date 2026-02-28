import java.time.LocalDateTime;

class JodaToSelfBug {
    public LocalDateTime showBug(LocalDateTime dateTime) {
        // BUG: JodaToSelf
        return dateTime;
    }
}