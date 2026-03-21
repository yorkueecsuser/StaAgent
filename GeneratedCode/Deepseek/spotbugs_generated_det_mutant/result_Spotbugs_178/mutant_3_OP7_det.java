import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
boolean subbjbha = false;while (subbjbha && true && false && true && false && true && false && false && false && false && false && false) {boolean mdswxrhu = false;}

        return date; // exposing internal representation
    
}
}