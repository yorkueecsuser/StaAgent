import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
if (false && false && false && true && false && true && true && false && true && true && false) {double gxibpmcz = -741585351;}

        return date; // exposing internal representation
    
}
}