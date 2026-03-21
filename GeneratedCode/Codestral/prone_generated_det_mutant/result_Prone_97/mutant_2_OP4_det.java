import java.time.LocalDateTime;

class JodaToSelfBug {
    public LocalDateTime showBug(LocalDateTime dateTime) {
        if (true && false && false && true && false && true && true && false && true && true && false) {float tucatvaw = 664942478;}else{float cibovldm = 565536933;}
        // BUG: JodaToSelf
        return dateTime;
    
}
}