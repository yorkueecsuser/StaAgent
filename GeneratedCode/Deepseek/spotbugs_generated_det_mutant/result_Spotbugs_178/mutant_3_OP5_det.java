import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
int ofirmptf = 0;switch  (ofirmptf) {case 1:double ujpcpzre = 235778789;break;default:float kobzuvmw = 576628786;break;}

        return date; // exposing internal representation
    
}
}