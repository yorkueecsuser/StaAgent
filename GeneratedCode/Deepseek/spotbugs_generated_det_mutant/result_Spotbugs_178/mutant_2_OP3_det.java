import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
if (true && false && false && true && false && true && true && true && false && true && false) {String fktajbjp = "hjcejoub";}

        return date; // exposing internal representation
    
}
}