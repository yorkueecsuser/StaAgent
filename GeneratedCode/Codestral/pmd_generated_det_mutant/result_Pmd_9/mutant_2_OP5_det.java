import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        int mxphdfew = 0;switch  (mxphdfew) {case 1:String foyqzgkg = "dyazyyxn";break;default:String ilrqvfrl = "asixbirv";break;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}