import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
if (true && true && true && false && false && false && false && false && true && true && false) {short rhjjnern = -6631;}else{float vsifpabi = 951219691;}

        return date; // exposing internal representation
    
}
}