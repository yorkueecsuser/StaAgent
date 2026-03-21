import java.util.Date;

class FixedCode {
    private Date date; // mutable object

    public FixedCode() {
        this.date = new Date();
    }

    public Date showBug() {
int mqvjlnzh = 0;switch  (mqvjlnzh) {case 1:String afyrunjv = "nrotdrur";break;default:boolean pkncuefv = false;break;}

        return date; // exposing internal representation
    
}
}