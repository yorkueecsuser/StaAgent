import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
byte liuzwgdd = 8;

        return date; // exposing internal representation
    
}
}