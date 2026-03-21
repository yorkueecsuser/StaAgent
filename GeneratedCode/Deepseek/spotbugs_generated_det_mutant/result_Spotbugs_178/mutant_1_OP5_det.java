import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
int csockxig = 0;switch  (csockxig) {case 1:long axhrkdon = 814086154;break;default:float hlmuhbky = -524067159;break;}

        return date; // exposing internal representation
    
}
}