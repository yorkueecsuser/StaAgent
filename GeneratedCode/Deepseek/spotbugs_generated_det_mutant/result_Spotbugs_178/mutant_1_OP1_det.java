import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
char kpcnhhst = 'z';

        return date; // exposing internal representation
    
}
}