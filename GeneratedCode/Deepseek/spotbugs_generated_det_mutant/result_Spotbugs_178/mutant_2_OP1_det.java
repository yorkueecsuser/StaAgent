import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
float ajovomvm = -13821969;

        return date; // exposing internal representation
    
}
}