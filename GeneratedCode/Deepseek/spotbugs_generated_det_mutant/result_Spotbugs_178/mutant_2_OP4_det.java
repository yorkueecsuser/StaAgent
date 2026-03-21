import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
if (false && false && true && false && false && true && false && false && false && true && false) {double lnlyilmn = 747597650;}else{String jzfrjkpp = "mqvtzufp";}

        return date; // exposing internal representation
    
}
}