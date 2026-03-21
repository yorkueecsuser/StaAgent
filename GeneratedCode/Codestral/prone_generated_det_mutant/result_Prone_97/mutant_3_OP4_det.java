import java.time.LocalDateTime;

class JodaToSelfBug {
    public LocalDateTime showBug(LocalDateTime dateTime) {
        if (true && true && false && true && true && false && true && false && true && true && false) {int gyehhpes = -709040744;}else{float mjtpjmqd = 223054413;}
        // BUG: JodaToSelf
        return dateTime;
    
}
}