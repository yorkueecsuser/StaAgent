import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        int icsjwqty = 0;switch  (icsjwqty) {case 1:String ynlehrel = "yabvmqdp";break;default:boolean urbslgqt = true;break;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}