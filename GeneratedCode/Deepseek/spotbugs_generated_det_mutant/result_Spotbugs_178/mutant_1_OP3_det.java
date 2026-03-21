import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
if (false && true && false && false && false && true && true && false && true && false && false) {boolean yvoqojzj = false;}

        return date; // exposing internal representation
    
}
}