import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
for  (int atzrklaa = 0; atzrklaa < 0; atzrklaa++) {int ljoatnja = 442900992;}

        return date; // exposing internal representation
    
}
}