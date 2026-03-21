import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
if (true && false && true && false && true && false && false && false && false && true && false) {double yicyvpam = -120141578;}else{short ldrldbcu = 8660;}

        return date; // exposing internal representation
    
}
}